package com.example.demo.services.impl;

import com.example.demo.dao.DemoDao;
import com.example.demo.services.DemoService;
import com.example.demo.vo.DemoVo;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    /* @Bean
     public SessionFactory getSessionFactory() {
         if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
             throw new NullPointerException("factory is not a hibernate factory");
         }
         return entityManagerFactory.unwrap(SessionFactory.class);
     }*/
    public SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }
    @Override
    @Transactional
    public Integer addDemo(DemoVo demoVo) {
        try {
            demoDao.save(demoVo);
        }catch (Exception e){
            log.warn("异常啦", e);
            throw new RuntimeException("出错啦");
        }
        return 0;
    }
    @Override
    @Transactional
    public Integer editDemo(DemoVo demoVo) {
        try {
            demoDao.save(demoVo);
        }catch (Exception e){
            log.warn("异常啦", e);
            throw new RuntimeException("出错啦");
        }
        return 0;
    }

    @Override
    @Transactional
    public Integer deletedDemo(Integer id) {
        try {
            demoDao.deleteById(id);
        }catch (Exception e){
            log.warn("异常啦", e);
            throw new RuntimeException("出错了");
        }
        return 0 ;
    }
    @Override
    public List<DemoVo> queryAll() {
        return demoDao.findAll();
    }

    @Override
    public List<DemoVo> queryAll2(Integer id) {
        return demoDao.findAll2(id);
    }

    @Override
    public Optional<DemoVo> queryone(int id) {
        return demoDao.findById(id);
    }

    @Override
    @Transactional
    public Integer deletedDemo2(Integer id) {
        try {
            demoDao.delete(id);
        }catch (Exception e){
            log.warn("异常啦", e);
            throw new RuntimeException("出错了");
        }
        return 2 ;
    }

    /**
     * 删除3
     *
     * @param id
     * @return
     */
    @Override
    public Integer deletedDemo3(Integer id) {
        //获取session
        Session session=getSessionFactory().getCurrentSession();
        Transaction tx  =  session.beginTransaction();
        try  {
            String sql="delete from msg where id=?1";
            session.createSQLQuery(sql).setInteger(1, id ).executeUpdate();
            tx.commit();
        }  catch  (Exception  e)  {
            tx.rollback();
            session.close();
            System.out.println("出错了"  +  e);
        }
        //关闭session
        session.close();
        //关闭sessionFactor
        this.getSessionFactory().close();
        return 3;
    }


    /**
     * 删除4
     *
     * @param id
     * @return
     */
    @Override
    public Integer deletedDemo4(Integer id) {
        //获取session
        Session session=getSessionFactory().getCurrentSession();
        Transaction tx  =  session.beginTransaction();
        try  {
            DemoVo demo = session.get(DemoVo.class,id);
            session.delete(demo);
            tx.commit();
        }  catch  (Exception  e)  {
            tx.rollback();
            session.close();
            System.out.println("出错了"  +  e);
        }
        //关闭session
        session.close();
        //关闭sessionFactor
        this.getSessionFactory().close();
        return 4;
    }
}
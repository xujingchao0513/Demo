package com.example.demo.dao;

import com.example.demo.vo.DemoVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DemoDao extends JpaRepository<DemoVo, Integer> {
    @Modifying
//    @Query(value = "delete from msg where id like '%?1%'", nativeQuery = true)
    @Query(value = "delete from msg where id = ?1 ", nativeQuery = true)
    public void delete(int id);

    @Query(value = "select id,name from msg where id like '%?1%' ", nativeQuery = true)
    public List<DemoVo> findAll2(int id);
}

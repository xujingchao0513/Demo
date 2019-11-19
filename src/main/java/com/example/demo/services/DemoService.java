package com.example.demo.services;


import com.example.demo.vo.DemoVo;

import java.util.List;
import java.util.Optional;

public interface DemoService {

    Integer addDemo(DemoVo emoVo);

    Integer editDemo(DemoVo emoVo);

    Integer deletedDemo(Integer id);

    List<DemoVo> queryAll();

    List<DemoVo> queryAll2(Integer id);

    Optional<DemoVo> queryone(int id);

    Integer deletedDemo2(Integer id);

    Integer deletedDemo3(Integer id);

    Integer deletedDemo4(Integer id);

}
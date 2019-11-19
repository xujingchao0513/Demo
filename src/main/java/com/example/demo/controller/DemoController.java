package com.example.demo.controller;
import com.example.demo.services.DemoService;
import com.example.demo.vo.DemoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/test")
public class DemoController {
    @Autowired
    private DemoService demoService;
    @RequestMapping("/Docker")
    public String index() {
        return "Hello Docker!";
    }
   /* *//**
     *  新增
     * @param demoVo
     * @return
     *//*
    @PostMapping("/add")
    public Integer addDemo(@RequestBody DemoVo demoVo){
        return demoService.addDemo(demoVo);
    }
    *//**
     *  修改
     * @param demoVo
     * @return
     *//*
    @PostMapping("/edit")
    public Integer editDemo(@RequestBody DemoVo demoVo){
        return demoService.editDemo(demoVo);
    }

    *//**
     * 删除
     * @param id
     * @return
     *//*
    @DeleteMapping("/delete/{id}")
    public Integer deleteDemo(@PathVariable(value = "id")Integer id){
        return demoService.deletedDemo(id);
    }

    *//**
     * 查询
     * @return
     *//*
    @GetMapping("/query")
    public List queryDemo(){
        return demoService.queryAll();
    }

    *//**
     * 查询2
     * @return
     *//*
    @GetMapping("/query2/{id}")
    public List queryDemo2(@PathVariable(value = "id")Integer id){
        System.out.println("sss"+id);
        return demoService.queryAll2(id);
    }

    *//**
     * 查看
     * @param id
     * @returnmethodCache = {ConcurrentHashMap@9411}  size = 1
     *//*
    @GetMapping("/show/{id}")
    public Optional<DemoVo> showDemo(@PathVariable(value = "id")Integer id){
        return demoService.queryone(id);
    }
    *//**
     * 删除2
     * @param id
     * @return
     *//*
    @DeleteMapping("/delete2/{id}")
    public Integer deleteDemo2(@PathVariable(value = "id")Integer id){
        return demoService.deletedDemo2(id);
    }
    *//**
     * 删除3
     * @param id
     * @return
     *//*
    @DeleteMapping("/delete3/{id}")
    public Integer deleteDemo3(@PathVariable(value = "id")Integer id){
        return demoService.deletedDemo3(id);
    }
    *//**
     * 删除4
     * @param id
     * @return
     *//*
    @DeleteMapping("/delete4/{id}")
    public Integer deleteDemo4(@PathVariable(value = "id")Integer id){
        return demoService.deletedDemo4(id);
    }*/
}
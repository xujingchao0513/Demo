package com.example.demo.vo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="msg")
public class DemoVo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

}

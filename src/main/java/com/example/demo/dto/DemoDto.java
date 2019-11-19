package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * 基本信息.
 */
@Data
public class DemoDto {
    @Id
    private Integer id;

    private String name;
}

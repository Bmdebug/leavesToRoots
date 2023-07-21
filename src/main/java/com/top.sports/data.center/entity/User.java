package com.top.sports.data.center.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class User {

    @ApiModelProperty(value = "标识,用户id")
    private Integer id;
    @ApiModelProperty(value = "用户名称")
    private String name;
    private String address;
    private String mobile;
    private String email;
    private Date createTime;
    private Integer role;
}
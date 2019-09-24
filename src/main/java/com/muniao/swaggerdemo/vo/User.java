package com.muniao.swaggerdemo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-06-05 9:43
 */
@ApiModel
@Data
public class User {

    @ApiModelProperty("用户id")
    private Long id;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("用户地址")
    private String address;
}

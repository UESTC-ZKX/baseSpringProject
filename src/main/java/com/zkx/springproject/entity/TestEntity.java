package com.zkx.springproject.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName TestEntity
 * @Description: 测试Entity
 * @Author UESTC-ZKX
 * @Date 2020/3/14
 **/
@Getter
@Setter
@ApiModel("测试对象实体")
public class TestEntity {
    @ApiModelProperty("测试对象 id")
    protected Integer id ;
    @ApiModelProperty("测试对象 name")
    protected String name ;
}

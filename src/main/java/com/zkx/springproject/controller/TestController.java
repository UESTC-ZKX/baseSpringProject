package com.zkx.springproject.controller;

import com.zkx.springproject.entity.TestEntity;
import com.zkx.springproject.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName TestController
 * @Description: 测试Controller
 * @Author UESTC-ZKX
 * @Date 2020/3/14
 **/
@RestController
@RequestMapping("/test")
@Api(tags = "初始搭建项目测试接口")
public class TestController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TestService testService ;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    @ApiOperation("通过Id查询接口")
    public TestEntity test(@PathVariable Integer id){
        try {
            return testService.getById(id);
        }
        catch (Exception e){
            logger.warn(e.getMessage());
        }
        return null;
    }

}

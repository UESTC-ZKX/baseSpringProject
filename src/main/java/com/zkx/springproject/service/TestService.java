package com.zkx.springproject.service;

import com.zkx.springproject.dao.TestDao;
import com.zkx.springproject.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestService
 * @Description: 测试Service
 * @Author UESTC-ZKX
 * @Date 2020/3/14
 **/
@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}

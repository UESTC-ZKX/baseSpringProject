package com.zkx.springproject.dao;

import com.zkx.springproject.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author UESTC-ZKX
 */
@Mapper
public interface TestDao {

    TestEntity getById(Integer id);

}

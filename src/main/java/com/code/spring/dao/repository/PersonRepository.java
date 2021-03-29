package com.code.spring.dao.repository;

import com.code.spring.dao.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.DependsOn;

@Mapper
public interface PersonRepository {
    Person getOneById(Integer id);
}


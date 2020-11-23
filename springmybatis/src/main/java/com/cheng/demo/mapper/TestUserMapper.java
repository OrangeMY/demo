package com.cheng.demo.mapper;

import com.cheng.demo.entity.TestUser;

import java.util.List;

public interface TestUserMapper {

    List<TestUser> selectAll();
    TestUser getOneUser(Long id);
    int insert(TestUser testUser);
    int update(TestUser testUser);
    int delete(Long id);
}

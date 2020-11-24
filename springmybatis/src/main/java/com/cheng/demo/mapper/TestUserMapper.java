package com.cheng.demo.mapper;

import com.cheng.demo.entity.TestUser;

import java.util.List;
import java.util.Map;

public interface TestUserMapper {

    /**
     * 查询所有的用户
     * @return
     */
    List<TestUser> selectAll();

    /**
     * 根据用户id查询某个用户
     * @param id 用户主键
     * @return
     */
    TestUser getOneUser(Long id);

    /**
     * 插入新用户
     * @param testUser
     * @return
     */
    int insert(TestUser testUser);

    /**
     * 更新用户
     * @param testUser
     * @return
     */
    int update(TestUser testUser);

    /**
     * 删除用户
     * @param id 用户主键
     * @return 返回sql语句执行结果
     */
    int delete(Long id);

    /**
     * 分页查询
     * @param params 分页sql相关的参数封装在这里
     * @return 返回的查询结果
     */
    List<TestUser> selectByPage(Map<String, Object> params);

    /**
     * 统计总记录数
     * @return 返回总记录数
     */
    Integer count();
}

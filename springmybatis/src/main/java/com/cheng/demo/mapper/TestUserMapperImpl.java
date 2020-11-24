package com.cheng.demo.mapper;

import com.cheng.demo.entity.TestUser;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class TestUserMapperImpl implements TestUserMapper {

    SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<TestUser> selectAll() {
        TestUserMapper testUserMapper = sqlSession.getMapper(TestUserMapper.class);
        return testUserMapper.selectAll();
    }

    @Override
    public TestUser getOneUser(Long id) {
        TestUserMapper testUserMapper = sqlSession.getMapper(TestUserMapper.class);
        return testUserMapper.getOneUser(id);
    }

    @Override
    public int insert(TestUser testUser) {
        TestUserMapper testUserMapper = sqlSession.getMapper(TestUserMapper.class);
        Integer result = testUserMapper.insert(testUser);
        return result;
    }

    @Override
    public int update(TestUser testUser) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        TestUserMapper testUserMapper = sqlSession.getMapper(TestUserMapper.class);
        return testUserMapper.delete(id);
    }

    @Override
    public List<TestUser> selectByPage(Map<String, Object> params) {
        TestUserMapper testUserMapper = sqlSession.getMapper(TestUserMapper.class);
        return testUserMapper.selectByPage(params);
    }

    @Override
    public Integer count() {
        TestUserMapper testUserMapper = sqlSession.getMapper(TestUserMapper.class);
        return testUserMapper.count();
    }
}

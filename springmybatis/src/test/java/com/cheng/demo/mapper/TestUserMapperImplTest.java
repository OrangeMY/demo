package com.cheng.demo.mapper;

import com.cheng.demo.entity.TestUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class TestUserMapperImplTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
    TestUserMapperImpl testUserMapper = (TestUserMapperImpl) context.getBean("testUserMapper");

    @Test
    public void selectAll() {
        List<TestUser> testUserList = testUserMapper.selectAll();
        for (TestUser user : testUserList) {
            System.out.println(user);
        }
    }

    @Test
    public void getOneUser() {
        TestUser testUser = testUserMapper.getOneUser(100000002L);
        System.out.println(testUser);
    }

    @Test
    public void insert() {
        // 随机数，用于生成随机性别
        Random r = new Random();
        for (int i = 1; i <= 50; i++) {
            TestUser testUser = new TestUser();
            testUser.setName("Michael" + i);
            testUser.setSex(r.nextInt(3));
            testUser.setRemark("handsome" + i);
            testUser.setCreateTime(new java.sql.Date(new Date().getTime()));
            testUser.setBelongOprName("程明杨");
            Integer result = testUserMapper.insert(testUser);
            System.out.println(result);
        }
    }

    @Test
    public void update() {
        Long id = 100000004L;
        TestUser newUser = testUserMapper.getOneUser(id);
        newUser.setUpdateTime(new Date());
        Integer result = testUserMapper.update(newUser);
        System.out.println(result);
    }

    @Test
    public void delete() {
        Integer result = testUserMapper.delete(100000004L);
        System.out.println(result);
    }

    @Test
    public void selectByPage() {
        HashMap<String, Object> params = new HashMap();
        int page = 3;
        int size = 5;
        params.put("page", (page - 1) * size);
        params.put("size", 5);
        List<TestUser> lists = testUserMapper.selectByPage(params);
        for (TestUser user : lists) {
            System.out.println(user);
        }
    }

    @Test
    public void count() {
    }
}

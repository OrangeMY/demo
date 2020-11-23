package com.cheng.demo1;

import com.cheng.entity.TestUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class HardCodeDemo {

    public static void main(String[] args) throws IOException {
        // 读取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 构建sqlSessionFatory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TestUser testUser = new TestUser();
        List<TestUser> TestUserList = sqlSession.selectList("TestUserMapper.selectAll");
        for (TestUser user : TestUserList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}

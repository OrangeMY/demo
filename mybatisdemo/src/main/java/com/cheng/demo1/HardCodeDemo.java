package com.cheng.demo1;

import com.cheng.entity.TestUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class HardCodeDemo {

    public static void main(String[] args) throws IOException {
        // 读取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 构建sqlSessionFatory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // selectAll
        System.out.println("==== 下面是selectAll方法的结果： ====");
        List<TestUser> TestUserList = sqlSession.selectList("TestUserMapper.selectAll");
        for (TestUser user : TestUserList) {
            System.out.println(user);
        }
        // selectOne
        System.out.println("==== 下面是selectOne方法的结果： ====");
        TestUser user1 = sqlSession.selectOne("TestUserMapper.selectOne", 100000002L);
        System.out.println(user1);
        sqlSession.close();
    }
}

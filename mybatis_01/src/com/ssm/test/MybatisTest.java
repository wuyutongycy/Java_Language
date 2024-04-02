package com.ssm.test;

import com.ssm.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    @Test
    public void test1() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("com.ssm.mapper.UserMapper.findUserById",2);
        System.out.println(user);
        sqlSession.close();
    }

 @Test
    public void test2() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setPhone("1897216");
        user.setUname("吴倩");
        int i = sqlSession.insert("com.ssm.mapper.UserMapper.addUser",user);
        if(i>0){
            System.out.println("成功添加了" + i +"条记录");
        }else {
            System.out.println("添加失败！");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }


}

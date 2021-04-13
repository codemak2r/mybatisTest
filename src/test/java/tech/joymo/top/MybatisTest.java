/*
 * @Description:
 * @Date: 2021/4/13
 */
package tech.joymo.top;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tech.joymo.top.mapper.TopRoleMapper;
import tech.joymo.top.model.TopRole;
import tech.joymo.top.model.TopRoleExample;
import tech.joymo.top.model.TopUser;

import java.io.IOException;
import java.io.InputStream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class MybatisTest {
    private SqlSession sqlSession;
    @BeforeTest
    public void init(){
        System.out.println("====== 增删改查测试 =======");
        String resource = "mybatisConfig.xml";
        InputStream is = null ;
        try{
            is = Resources.getResourceAsStream("mybatisConfig.xml");
        }catch (IOException e) {

        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is, "database_1");
        sqlSession = sqlSessionFactory.openSession(true);
    }

    @Test
    public void testAdd(){
        TopRole role = new TopRole();
        role.setId(1L);
        role.setName("admin");
        role.setType("admin_type");
        role.setDescription("test");
        role.setCreateTime(new Date());
        role.setUpdateTime(new Date());
        TopRoleMapper tp = sqlSession.getMapper(TopRoleMapper.class);
        int result = tp.insert(role);
    }
    @Test
    public void testSelect(){
        TopRoleMapper tp = sqlSession.getMapper(TopRoleMapper.class);
        TopRole r = tp.selectByPrimaryKey(1L);
        Assert.assertEquals("admin", r.getName());
    }
    @Test
    public void testUpdate(){
        TopRoleMapper tp = sqlSession.getMapper(TopRoleMapper.class);
        TopRole role = new TopRole();
        role.setId(1L);
        role.setName("admin3");
        int result = tp.updateByPrimaryKeySelective(role);

    }
    @Test
    public void testDelete(){
        TopRoleMapper tp = sqlSession.getMapper(TopRoleMapper.class);
        tp.deleteByPrimaryKey(1L);
    }


    @AfterTest
    public void clear(){
        sqlSession.clearCache();
        sqlSession.close();
    }
}

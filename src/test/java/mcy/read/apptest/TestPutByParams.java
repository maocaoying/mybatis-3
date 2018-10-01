package mcy.read.apptest;

import mcy.read.MyBaseTest;
import mcy.read.mapper.UserMapper;
import mcy.read.po.User;
import org.junit.Test;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/09/30
 * @Description :
 *
 * 对数据库增更删
 */
public class TestPutByParams extends MyBaseTest {

    /**
     * 主键回填获取ID
     */
    @Test
    public void insertUserAndGetID(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("Vic");
        user.setAge(20);
        userMapper.insertUserAndGetID(user);
        System.out.println(user.getId());
        sqlSession.commit();
    }

    /**
     * 获取自主生成的主键
     */
    @Test
    public void insertUserAndGetIDBySelf() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("Vicc");
        user.setAge(20);
        userMapper.insertUserAndGetIDBySelf(user);
        System.out.println(user.getId());
        sqlSession.commit();
    }
}

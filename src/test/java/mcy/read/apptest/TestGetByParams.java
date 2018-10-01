package mcy.read.apptest;

import mcy.read.MyBaseTest;
import mcy.read.mapper.UserMapper;
import mcy.read.po.User;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/09/30
 * @Description :
 *
 * 通过三种传递参数方式获取数据
 */
public class TestGetByParams extends MyBaseTest {

    /**
     * 通过Map传递参数
     */
    @Test
    public void testParamsByMap() {
        Map map = new HashMap();
        map.put("id", 1);
        User user= sqlSession.selectOne("getUserByMap",map);
        System.out.println(user.getName());
    }

    /**
     * 通过注解传递参数
     */
    @Test
    public void testParamsByAnn() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserByID(1).getName());
    }
    /**
     * 通过Bean传递参数
     */
    @Test
    public void testParamsByBean() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(1);
        System.out.println(userMapper.getUserByBean(user).getName());
    }
}

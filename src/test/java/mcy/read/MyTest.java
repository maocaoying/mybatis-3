package mcy.read;

import mcy.read.mapper.UserMapper;
import org.junit.Test;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/09/28
 * @Description :
 */
public class MyTest extends MyBaseTest {

    @Test
    public void testSelect() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUser(1));
    }

    @Test
    public void testSelectPara() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUserByID(1));
    }

}

package mcy.read.typeHandler;

import mcy.read.MyBaseTest;
import mcy.read.po.User;
import org.junit.Test;

import java.util.List;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/09/29
 * @Description :
 */
public class TestTypeHandler extends MyBaseTest {

    @Test
    public void testTyphandler() {
        List<User> list = sqlSession.selectList("getUsers");
        for (User user:list
             ) {
            System.out.println(user.getName());
        }
    }

}

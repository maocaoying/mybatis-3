package mcy.read.apptest;

import mcy.read.MyTest;
import mcy.read.mapper.UserMapper;
import mcy.read.po.Record;
import mcy.read.po.UserInfo;
import org.junit.Test;

import java.util.List;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/09/30
 * @Description :
 *
 * 级联
 * 缺点：每加一个级联就多执行一次sql,会导致性能下降
 * 解决方案：sql一次性把数据查询出来统一处理
 */
public class TestAssociationAndCollection extends MyTest {

    @Test
    public void testAssociation() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserInfo userInfo = userMapper.getUserInfroByID(11);
        System.out.println(userInfo.getCard().getNativ());
        List<Record> records = userInfo.getRecords();
        for (Record record : records) {
            System.out.println(record.getRecord());
        }
    }
}

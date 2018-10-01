package mcy.read.mapper;

import mcy.read.po.User;
import mcy.read.po.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author : Vic.Yin
 * @version v.0.1
 * @date : 2018/09/28
 * @Description:
 */
public interface UserMapper {
    User getUser(Integer id);
    User getUserByID(@Param(value = "id") Integer id);
    User getUserByBean(User user);

    UserInfo getUserInfroByID(Integer integer);
    /**
     * 获取回填ID
     * @param user
     * @return
     */
    Integer insertUserAndGetID(User user);
    Integer insertUserAndGetIDBySelf(User user);
}

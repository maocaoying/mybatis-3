package mcy.read.typeHandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/09/29
 * @Description :
 */

@MappedTypes(String.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyStringTypeHandler implements TypeHandler<String> {

    private Logger logger = LoggerFactory.getLogger(MyStringTypeHandler.class);

    @Override
    public void setParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
        System.out.println("使用我的TypeHandler");
        ps.setString(i,parameter);
    }

    @Override
    public String getResult(ResultSet rs, String columnName) throws SQLException {
        System.out.println("返回结果：");
        return rs.getString(columnName);
    }

    @Override
    public String getResult(ResultSet rs, int columnIndex) throws SQLException {
        System.out.println("返回结果：");

        return rs.getString(columnIndex);
    }

    @Override
    public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
        System.out.println("返回结果：");

        return cs.getString(columnIndex);
    }
}

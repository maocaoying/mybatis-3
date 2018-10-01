package mcy.read;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/09/30
 * @Description :
 */
public abstract class MyBaseTest {

    protected InputStream inputStream;
    protected SqlSession sqlSession;
    protected SqlSessionFactory sqlSessionFactory;

    @Before
    public void initeDataSources() {
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }
}

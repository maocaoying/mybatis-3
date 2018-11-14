package mcy.read.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/10/01
 * @Description :
 *
 * jdk动态代理需要提供接口才可以使用
 */
public class TestProxyMain {

    public static void main(String[] args) {
        TestProxyHandler testProxyHandler = new TestProxyHandler();
        TestProxyInterface testProxyInterface = (TestProxyInterface) testProxyHandler.bind(new TestProxyImpl());
        testProxyInterface.say("proxy test");
    }
}

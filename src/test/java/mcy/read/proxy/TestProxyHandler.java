package mcy.read.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/10/01
 * @Description :
 */
public class TestProxyHandler implements InvocationHandler {

    /**
     * 真实业务对象
     */
    private Object target;


    /**
     * 绑定委托对象并返回代理类
     * @param target
     * @return
     */
    public Object bind(Object target) {
        this.target = target;
        //取得代理对象
        //jdk代理需要提供接口 target.getClass().getInterfaces()
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    /**
     * 通过代理对象调用方法首先进入这个方法，并返回结果
     * @param proxy 代理对象
     * @param method 被调用的方法
     * @param args 方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--- jdk 动态代理 ---");
        Object result = null;
        //反射方法前调用
        System.out.println("--- 方法调用之前 ---");
        result = method.invoke(target, args);
        System.out.println("--- 方法调用之后 ---");
        return result;
    }
}

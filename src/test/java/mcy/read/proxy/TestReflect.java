package mcy.read.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/10/01
 * @Description :
 */
public class TestReflect {

    public void say(String par) {
        System.out.println(" hello reflect " + par);
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Object object = Class.forName(TestReflect.class.getName()).newInstance();
        TestReflect object = new TestReflect();
        Method method =  object.getClass().getMethod("say", String.class);
        method.invoke(object, "test");
    }
}

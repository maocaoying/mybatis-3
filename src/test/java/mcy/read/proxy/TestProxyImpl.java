package mcy.read.proxy;

/**
 * @author : Vic.Yin
 * @version : v.0.1
 * @date : 2018/10/01
 * @Description :
 */
public class TestProxyImpl implements TestProxyInterface {
    @Override
    public void say(String par) {
        System.out.println(" test proxy "+ par);
    }
}

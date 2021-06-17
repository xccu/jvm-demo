package jvm.demo.ch2;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 2-9 借助GCLib使得方法区出现内存溢出异常
 * VM args:-XX:PermSize=10M -XX:MaxPermSize=10M
 *
 * Result:仅JDK7出现异常
 *
 */
public class JavaMethodAreaOOM {

    public static void main(String[] agrs){

        while(true){
            Enhancer enhancer =new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                    return proxy.invokeSuper(obj, args);
                }
            });
            enhancer.create();
        }
    }

    static class OOMObject{}
}

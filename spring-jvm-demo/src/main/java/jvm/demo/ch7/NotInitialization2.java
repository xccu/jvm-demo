package jvm.demo.ch7;

/**
 * 7-1 被动引用的例子之二
 * 非主动使用类字段演示
 *
 * 可使用：
 * -XX:+TraceClassLoading
 * 观察子类加载
 *
 */
public class NotInitialization2 {
    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }
}

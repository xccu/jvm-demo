package jvm.demo.ch7;

/**
 * 7-1 被动引用的例子之一
 * 非主动使用类字段演示
 *
 * 输出：
 * SuperClass init!
 * 123
 *
 */
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}

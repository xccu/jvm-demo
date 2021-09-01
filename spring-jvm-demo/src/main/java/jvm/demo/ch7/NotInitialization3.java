package jvm.demo.ch7;

/**
 * 7-1 被动引用的例子之三
 * 非主动使用类字段演示
 *
 * 输出：
 * hello world
 */
public class NotInitialization3 {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}
package jvm.demo.ch7;

/**
 * 7-6 <clinit>()方法执行顺序
 */
public class ClinitTest {

    //最先执行父类的<clinit>()方法
    static class Parent{
        public static int A=1;
        static {
            A=2;
        }
    }

    static class Sub extends Parent {
        public static int B = A;
    }

    public static void main(String[] args) {
        //输出2
        System.out.println(Sub.B);
    }
}

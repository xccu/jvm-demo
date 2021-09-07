package jvm.demo.ch7;

/**
 * 7-4 字段解析
 * 线程死锁等待演示
 */
public class FieldResolution {

    interface Interface0{
        int A = 0;
    }

    interface Interface1 extends Interface0 {
        int A = 1;
    }

    interface Interface2 {
        int A = 2;
    }

    static class Parents implements Interface1 {
        public static int A = 3;
    }

    static class Sub extends Parents implements Interface2 {
        //注释后会报错
        public static int A = 4;
    }

    public static void main(String[] args) {
        //输出4
        System.out.println(Sub.A);
    }
}

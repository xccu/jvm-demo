package jvm.demo.ch4;


/**
 * 4-6 JHSDB测试代码
 * staticObj,instanceObj,localObj存放在哪里?
 *
 * VM args:-Xmx10m -XX:+UseSerialGC -XX:-UseCompressedOops
 *
 */
public class JHSDB_TestCase {
    static class Test{
        static ObjectHolder staticObj = new ObjectHolder(); //存放在方法区
        ObjectHolder instanceObj = new ObjectHolder();      //存放在Test对象实例存放的java堆

        void foo(){
            ObjectHolder localObj = new ObjectHolder();     //存放在foo方法栈帧的局部变量表
            System.out.println("done"); //此处设一个断点
        }
    }

    private static class ObjectHolder{}

    public static void main(String[] agrs){
        Test test = new JHSDB_TestCase.Test();
        test.foo();
    }

}

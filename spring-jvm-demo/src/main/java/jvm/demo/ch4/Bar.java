package jvm.demo.ch4;

/**
 * 4-12 HSDIS反汇编测试代码
 * args:
 * java -XX:+PrintAssembly -Xcomp -XX:CompileCommand=dontinline,*jvm.demo.ch4 -XX:CompileCommand=compileonly,*jvm.demo.ch4.Bar
 */
public class Bar {

    int a=1;
    static int b =2;

    public int sum(int c){
        return a+b+c;
    }

    public static void main(String[] agrs) {
       new Bar().sum(3);
    }
}

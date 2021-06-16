package jvm.demo.ch2;

/**
 * 2-4 虚拟机栈和本地方法栈测试
 * VM args:
 *
 * Result：
 * Exception in thread "main" Stack Length:982
 * java.lang.StackOverflowError
 */
public class JavaVMStackSOF {
    private int stackLength =1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] agrs) throws Throwable {

        JavaVMStackSOF oom = new JavaVMStackSOF();

        try{
            oom.stackLeak();
        }
        catch (Throwable e){
            System.out.println("Stack Length:"+oom.stackLength);
            throw e;
        }
    }
}
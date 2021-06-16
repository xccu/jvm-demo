package jvm.demo.ch2;


/**
 * 2-6 创建线程导致内存溢出异常
 * VM args: -Xss2M
 *警告：运行此代码会导致卡死
 *
 * Result：
 * Exception in thread "main" java.lang.OutOfMemoryError: unable to create new native thread
 */
public class JavaVMStackOOM {


    private void dontStop(){
        while(true){}
    }

    public void stackLeakByThread(){
        while(true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] agrs) throws Throwable {

        JavaVMStackOOM oom = new JavaVMStackOOM();

        oom.stackLeakByThread();
    }
}
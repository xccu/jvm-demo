package jvm.demo.ch2;

import sun.misc.Unsafe; //JDK8支持，JDK11不支持

import java.lang.reflect.Field;

/**
 * 2-10 使用unsafe分配本机内存
 * VM args:-Xmx20M -XX:MaxDirectMemorySize=10M
 *
 * Result:
 * Exception in thread "main" java.lang.OutOfMemoryError
 * 	at sun.misc.Unsafe.allocateMemory(Native Method)
 * 	at jvm.demo.ch2.DirectMemoryOOM.main(DirectMemoryOOM.java:20)
 */
public class DirectMemoryOOM {

    private static final int _1MB = 1024*1024;

    public static void main(String[] agrs) throws Exception{
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while(true){
            unsafe.allocateMemory(_1MB); //分配内存
        }
    }
}

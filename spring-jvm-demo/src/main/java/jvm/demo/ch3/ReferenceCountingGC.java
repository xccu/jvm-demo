package jvm.demo.ch3;

/**
 * 3-1 引用计数算法的缺陷
 *
 */
public class ReferenceCountingGC {

    public Object instance = null;

    private static final int _1MB = 1024*1024;

    //该成员属性的唯一意义就是占点内存，以便能在GC日志中看清是否回收过
    private byte[] bigSize = new byte[2*_1MB];

    public static void main(String[] agrs){
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA=null;
        objB=null;

        //假设在这行发生GC，观察objA和objB能否被回收
        System.gc();
    }
}
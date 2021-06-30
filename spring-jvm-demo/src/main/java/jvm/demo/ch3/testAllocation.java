package jvm.demo.ch3;

/**
 * 3-7 新生代Minor GC
 * VM args:-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 *
 * Result:
 * [GC (Allocation Failure) [PSYoungGen: 6285K->840K(9216K)] 6285K->4944K(19456K), 0.0027938 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
 * Heap
 *  PSYoungGen      total 9216K, used 7305K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 *   eden space 8192K, 78% used [0x00000000ff600000,0x00000000ffc50660,0x00000000ffe00000)
 *   from space 1024K, 82% used [0x00000000ffe00000,0x00000000ffed2020,0x00000000fff00000)
 *   to   space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
 *  ParOldGen       total 10240K, used 4104K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 *   object space 10240K, 40% used [0x00000000fec00000,0x00000000ff002020,0x00000000ff600000)
 *  Metaspace       used 3467K, capacity 4496K, committed 4864K, reserved 1056768K
 *   class space    used 381K, capacity 388K, committed 512K, reserved 1048576K
 *
 */
public class testAllocation {

    private static final int _1MB=1024*1024;

    public static void main(String[] agrs){
        byte[] allocation1 = new byte[2*_1MB];
        byte[] allocation2 = new byte[2*_1MB];
        byte[] allocation3 = new byte[2*_1MB];
        byte[] allocation4 = new byte[4*_1MB]; //出现一次Minor GC
    }
}

package jvm.demo.ch3;

/**
 * 3-8 大对象直接进入老年代
 * VM args:
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
 *
 * Result:
 * Heap
 *  PSYoungGen      total 9216K, used 2175K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
 *   eden space 8192K, 26% used [0x00000000ff600000,0x00000000ff81fc70,0x00000000ffe00000)
 *   from space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
 *   to   space 1024K, 0% used [0x00000000ffe00000,0x00000000ffe00000,0x00000000fff00000)
 *  ParOldGen       total 10240K, used 8192K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
 *   object space 10240K, 80% used [0x00000000fec00000,0x00000000ff400010,0x00000000ff600000)
 *  PSPermGen       total 21504K, used 3049K [0x00000000f9a00000, 0x00000000faf00000, 0x00000000fec00000)
 *   object space 21504K, 14% used [0x00000000f9a00000,0x00000000f9cfa7d0,0x00000000faf00000)
 */
public class TestPretenureSizeThreshold {

    private static final int _1MB = 1024*1024;

    public static void main(String[] agrs){
       byte[] allocation;
       allocation = new byte[8*_1MB]; //直接分配在老年代(tenured generation 或者 ParOldGen)中
    }
}

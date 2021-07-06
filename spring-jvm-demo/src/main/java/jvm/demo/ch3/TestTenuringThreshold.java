package jvm.demo.ch3;

/**
 * 3-9 长期存活的对象进入老年代
 * VM args:
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 *
 * Result:
 * ?????
 */
public class TestTenuringThreshold {

    private static final int _1MB = 1024*1024;

    @SuppressWarnings("unused")
    public static void main(String[] agrs){
        byte[] allocation1,allocation2,allocation3;

        //什么时候进入老年代取决于MaxTenuringThreshold设置
        allocation1 = new byte[_1MB/4];

        allocation2 = new byte[4*_1MB];
        allocation3 = new byte[4*_1MB];
        allocation3 = null;
        allocation3 = new byte[4*_1MB];
    }
}

package jvm.demo.ch3;

/**
 * 3-11 空间分配担保
 * 注意：仅在 JDK6 Updatw24 之前有效
 * VM args:
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:HandlePromotionFailure
 *
 * Result:
 * ?????
 */
public class TestHandlePromotion {

    private static final int _1MB = 1024*1024;

    @SuppressWarnings("unused")
    public static void main(String[] agrs){
        byte[] allocation1,allocation2,allocation3,allocation4,
        allocation5,allocation6,allocation7;

        //allocation1+allocation2大于Survivor一半空间
        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];
        allocation3 = new byte[2*_1MB];
        allocation1 = null;

        allocation4 = new byte[2*_1MB];
        allocation5 = new byte[2*_1MB];
        allocation6 = new byte[2*_1MB];

        allocation4 = null;
        allocation5 = null;
        allocation6 = null;
        allocation7 = new byte[2*_1MB];
    }
}

package jvm.demo.ch3;

/**
 * 3-2 一次对象自我拯救的演示
 *
 * 此代码演示了两点：
 * 1.对象可以在被CG时自我拯救
 * 2.这种自我拯救机会只有一次，因为一个对象的finalize()方法最多只会被系统自动调用一次
 *
 * Result:
 * finalize method executed!
 * yes,I'm still alive :)
 * no,I'm dead :(
 */
public class FinalizeEscapeGC {

    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("yes,I'm still alive :)");
    }

    @Override
    protected void finalize() throws Throwable{ //该方法会被GC触发
        super.finalize();
        System.out.println("finalize method executed!");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] agrs) throws Throwable {
        SAVE_HOOK = new FinalizeEscapeGC();

        //对象第一次成功拯救自己
        SAVE_HOOK = null;
        System.gc();

        //因为Finalizer方法优先级很低，暂定500毫秒以等待它
        Thread.sleep(500);

        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }
        else {
            System.out.println("no,I'm dead :(");
        }

        //下面这段代码与上面完全相同，但这次自我拯救失败了
        SAVE_HOOK = null;
        System.gc();

        //因为Finalizer方法优先级很低，暂定500毫秒以等待它
        Thread.sleep(500);

        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }
        else {
            System.out.println("no,I'm dead :(");
        }
    }
}

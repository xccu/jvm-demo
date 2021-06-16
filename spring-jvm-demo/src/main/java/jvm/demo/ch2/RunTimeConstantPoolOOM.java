package jvm.demo.ch2;

import java.util.HashSet;
import java.util.Set;

/**
 * 2-7 运行时常量池导致的内存溢出异常
 * VM args:-XX:PermSize=6M -XX:MaxPermSize=6M
 *
 * Result:
 *
 */
public class RunTimeConstantPoolOOM {


    public static void main(String[] agrs){
        //使用Set保持常量池引用，避免Full GC垃圾回收常量池行为
        Set<String> set = new HashSet<String>();
        //在short范围内足以让6MB的PermSize产生OOM了
        short i =0;
        while(true){
            set.add(String.valueOf(i++).intern());
        }
    }
}

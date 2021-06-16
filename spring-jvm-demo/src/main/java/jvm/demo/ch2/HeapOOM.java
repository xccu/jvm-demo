package jvm.demo.ch2;

import java.util.ArrayList;
import java.util.List;

/**
 * 2-3 Java堆内存溢出异常测试
 * VM args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * Result:
 * java.lang.OutOfMemoryError: Java heap space
 * Dumping heap to java_pid10236.hprof ...
 * Heap dump file created [28245636 bytes in 0.088 secs]
 *
 */
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] agrs){
        List<OOMObject> list = new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }
    }
}

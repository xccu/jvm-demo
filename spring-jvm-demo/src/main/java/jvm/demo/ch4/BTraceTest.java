package jvm.demo.ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4-10 BTrace跟踪演示
 */
public class BTraceTest {

    public int add(int a,int b){
        return a+b;
    }

    public static void main(String[] agrs) throws IOException {
        BTraceTest test = new BTraceTest();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<10;i++){
            reader.readLine();
            int a = (int)Math.round(Math.random()*1000);
            int b = (int)Math.round(Math.random()*1000);
            System.out.println(test.add(a,b));
        }
    }
}

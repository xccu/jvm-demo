package jvm.demo.ch6;

import java.util.Date;

/**
 * 6-2 使用javap命令输出常量表
 * javap -verbose JavapTest.class
 * win10下需要用管理员打开cmd
 */
public class JavapTest {

    private int count = 0;

    public static void main(String[] args) {
        JavapTest testDate = new JavapTest();
        testDate.test1();
    }

    public void test1(){
        Date date = new Date();
        String name1 = "user1";
        test2(date,name1);
        System.out.println(date+name1);
    }

    public void test2(Date dateP,String name2){
        dateP = null;
        name2 = "zhangsan";
    }

    public void test3(){
        count++;
    }

    public void  test4(){
        int a = 0;
        {
            int b = 0;
            b = a+1;
        }
        int c = a+1;
    }
}


/*输出结果*/
/*
c:\Users\xcy\Desktop>javap -verbose JavapTest.class
Classfile /c:/Users/xcy/Desktop/JavapTest.class
Last modified 2021-8-11; size 1450 bytes
        MD5 checksum 004f1b9164dde7007157ac91e63a8be8
        Compiled from "JavapTest.java"
public class jvm.demo.ch6.JavapTest
        minor version: 0
        major version: 52
        flags: ACC_PUBLIC, ACC_SUPER
        Constant pool:
        #1 = Methodref          #18.#49        // java/lang/Object."<init>":()V
        #2 = Fieldref           #3.#50         // jvm/demo/ch6/JavapTest.count:I
        #3 = Class              #51            // jvm/demo/ch6/JavapTest
        #4 = Methodref          #3.#49         // jvm/demo/ch6/JavapTest."<init>":()V
        #5 = Methodref          #3.#52         // jvm/demo/ch6/JavapTest.test1:()V
        #6 = Class              #53            // java/util/Date
        #7 = Methodref          #6.#49         // java/util/Date."<init>":()V
        #8 = String             #54            // user1
        #9 = Methodref          #3.#55         // jvm/demo/ch6/JavapTest.test2:(Ljava/util/Date;Ljava/lang/String;)V
        #10 = Fieldref           #56.#57        // java/lang/System.out:Ljava/io/PrintStream;
        #11 = Class              #58            // java/lang/StringBuilder
        #12 = Methodref          #11.#49        // java/lang/StringBuilder."<init>":()V
        #13 = Methodref          #11.#59        // java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        #14 = Methodref          #11.#60        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        #15 = Methodref          #11.#61        // java/lang/StringBuilder.toString:()Ljava/lang/String;
        #16 = Methodref          #62.#63        // java/io/PrintStream.println:(Ljava/lang/String;)V
        #17 = String             #64            // zhangsan
        #18 = Class              #65            // java/lang/Object
        #19 = Utf8               count
        #20 = Utf8               I
        #21 = Utf8               <init>
  #22 = Utf8               ()V
          #23 = Utf8               Code
          #24 = Utf8               LineNumberTable
          #25 = Utf8               LocalVariableTable
          #26 = Utf8               this
          #27 = Utf8               Ljvm/demo/ch6/JavapTest;
          #28 = Utf8               main
          #29 = Utf8               ([Ljava/lang/String;)V
          #30 = Utf8               args
          #31 = Utf8               [Ljava/lang/String;
          #32 = Utf8               testDate
          #33 = Utf8               test1
          #34 = Utf8               date
          #35 = Utf8               Ljava/util/Date;
          #36 = Utf8               name1
          #37 = Utf8               Ljava/lang/String;
          #38 = Utf8               test2
          #39 = Utf8               (Ljava/util/Date;Ljava/lang/String;)V
          #40 = Utf8               dateP
          #41 = Utf8               name2
          #42 = Utf8               test3
          #43 = Utf8               test4
          #44 = Utf8               b
          #45 = Utf8               a
          #46 = Utf8               c
          #47 = Utf8               SourceFile
          #48 = Utf8               JavapTest.java
          #49 = NameAndType        #21:#22        // "<init>":()V
          #50 = NameAndType        #19:#20        // count:I
          #51 = Utf8               jvm/demo/ch6/JavapTest
          #52 = NameAndType        #33:#22        // test1:()V
          #53 = Utf8               java/util/Date
          #54 = Utf8               user1
          #55 = NameAndType        #38:#39        // test2:(Ljava/util/Date;Ljava/lang/String;)V
          #56 = Class              #66            // java/lang/System
          #57 = NameAndType        #67:#68        // out:Ljava/io/PrintStream;
          #58 = Utf8               java/lang/StringBuilder
          #59 = NameAndType        #69:#70        // append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
          #60 = NameAndType        #69:#71        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
          #61 = NameAndType        #72:#73        // toString:()Ljava/lang/String;
          #62 = Class              #74            // java/io/PrintStream
          #63 = NameAndType        #75:#76        // println:(Ljava/lang/String;)V
          #64 = Utf8               zhangsan
          #65 = Utf8               java/lang/Object
          #66 = Utf8               java/lang/System
          #67 = Utf8               out
          #68 = Utf8               Ljava/io/PrintStream;
          #69 = Utf8               append
          #70 = Utf8               (Ljava/lang/Object;)Ljava/lang/StringBuilder;
          #71 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
          #72 = Utf8               toString
          #73 = Utf8               ()Ljava/lang/String;
          #74 = Utf8               java/io/PrintStream
          #75 = Utf8               println
          #76 = Utf8               (Ljava/lang/String;)V
          {
public jvm.demo.ch6.JavapTest();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
        stack=2, locals=1, args_size=1
        0: aload_0
        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
        4: aload_0
        5: iconst_0
        6: putfield      #2                  // Field count:I
        9: return
        LineNumberTable:
        line 5: 0
        line 7: 4
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0      10     0  this   Ljvm/demo/ch6/JavapTest;

public static void main(java.lang.String[]);
        descriptor: ([Ljava/lang/String;)V
        flags: ACC_PUBLIC, ACC_STATIC
        Code:
        stack=2, locals=2, args_size=1
        0: new           #3                  // class jvm/demo/ch6/JavapTest
        3: dup
        4: invokespecial #4                  // Method "<init>":()V
        7: astore_1
        8: aload_1
        9: invokevirtual #5                  // Method test1:()V
        12: return
        LineNumberTable:
        line 10: 0
        line 11: 8
        line 12: 12
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0      13     0  args   [Ljava/lang/String;
        8       5     1 testDate   Ljvm/demo/ch6/JavapTest;

public void test1();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
        stack=3, locals=3, args_size=1
        0: new           #6                  // class java/util/Date
        3: dup
        4: invokespecial #7                  // Method java/util/Date."<init>":()V
        7: astore_1
        8: ldc           #8                  // String user1
        10: astore_2
        11: aload_0
        12: aload_1
        13: aload_2
        14: invokevirtual #9                  // Method test2:(Ljava/util/Date;Ljava/lang/String;)V
        17: getstatic     #10                 // Field java/lang/System.out:Ljava/io/PrintStream;
        20: new           #11                 // class java/lang/StringBuilder
        23: dup
        24: invokespecial #12                 // Method java/lang/StringBuilder."<init>":()V
        27: aload_1
        28: invokevirtual #13                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        31: aload_2
        32: invokevirtual #14                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        35: invokevirtual #15                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
        38: invokevirtual #16                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        41: return
        LineNumberTable:
        line 15: 0
        line 16: 8
        line 17: 11
        line 18: 17
        line 19: 41
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0      42     0  this   Ljvm/demo/ch6/JavapTest;
        8      34     1  date   Ljava/util/Date;
        11      31     2 name1   Ljava/lang/String;

public void test2(java.util.Date, java.lang.String);
        descriptor: (Ljava/util/Date;Ljava/lang/String;)V
        flags: ACC_PUBLIC
        Code:
        stack=1, locals=3, args_size=3
        0: aconst_null
        1: astore_1
        2: ldc           #17                 // String zhangsan
        4: astore_2
        5: return
        LineNumberTable:
        line 22: 0
        line 23: 2
        line 24: 5
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0       6     0  this   Ljvm/demo/ch6/JavapTest;
        0       6     1 dateP   Ljava/util/Date;
        0       6     2 name2   Ljava/lang/String;

public void test3();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
        stack=3, locals=1, args_size=1
        0: aload_0
        1: dup
        2: getfield      #2                  // Field count:I
        5: iconst_1
        6: iadd
        7: putfield      #2                  // Field count:I
        10: return
        LineNumberTable:
        line 27: 0
        line 28: 10
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0      11     0  this   Ljvm/demo/ch6/JavapTest;

public void test4();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
        stack=2, locals=3, args_size=1
        0: iconst_0
        1: istore_1
        2: iconst_0
        3: istore_2
        4: iload_1
        5: iconst_1
        6: iadd
        7: istore_2
        8: iload_1
        9: iconst_1
        10: iadd
        11: istore_2
        12: return
        LineNumberTable:
        line 31: 0
        line 33: 2
        line 34: 4
        line 36: 8
        line 37: 12
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        4       4     2     b   I
        0      13     0  this   Ljvm/demo/ch6/JavapTest;
        2      11     1     a   I
        12       1     2     c   I
        }
        SourceFile: "JavapTest.java"

        c:\Users\xcy\Desktop>*/

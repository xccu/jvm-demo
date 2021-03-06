package jvm.demo.ch6;

/**
 * 6-4 使用javap命令计算字节码指令
 * javap -verbose TestClass.class
 * win10下需要用管理员打开cmd
 */
public class TestClass {

    private int m;
    public int inc(){
        return m+1;
    }
}


/*输出结果
C:\>javap -verbose TestClass.class
Classfile /C:/Users/xcy/Desktop/TestClass.class
Last modified 2021-8-16; size 379 bytes
        MD5 checksum 6b8daa3f106ae4faab69a6851da1dec6
        Compiled from "TestClass.java"
public class jvm.demo.ch6.TestClass
        minor version: 0
        major version: 50
        flags: ACC_PUBLIC, ACC_SUPER
        Constant pool:
        #1 = Methodref          #4.#18         // java/lang/Object."<init>":()V
        #2 = Fieldref           #3.#19         // jvm/demo/ch6/TestClass.m:I
        #3 = Class              #20            // jvm/demo/ch6/TestClass
        #4 = Class              #21            // java/lang/Object
        #5 = Utf8               m
        #6 = Utf8               I
        #7 = Utf8               <init>
   #8 = Utf8               ()V
           #9 = Utf8               Code
           #10 = Utf8               LineNumberTable
           #11 = Utf8               LocalVariableTable
           #12 = Utf8               this
           #13 = Utf8               Ljvm/demo/ch6/TestClass;
           #14 = Utf8               inc
           #15 = Utf8               ()I
           #16 = Utf8               SourceFile
           #17 = Utf8               TestClass.java
           #18 = NameAndType        #7:#8          // "<init>":()V
           #19 = NameAndType        #5:#6          // m:I
           #20 = Utf8               jvm/demo/ch6/TestClass
           #21 = Utf8               java/lang/Object
           {
public jvm.demo.ch6.TestClass();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
        stack=1, locals=1, args_size=1
        0: aload_0
        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
        4: return
        LineNumberTable:
        line 8: 0
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0       5     0  this   Ljvm/demo/ch6/TestClass;

public int inc();
        descriptor: ()I
        flags: ACC_PUBLIC
        Code:
        stack=2, locals=1, args_size=1
        0: aload_0
        1: getfield      #2                  // Field m:I
        4: iconst_1
        5: iadd
        6: ireturn
        LineNumberTable:
        line 12: 0
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0       7     0  this   Ljvm/demo/ch6/TestClass;
        }
        SourceFile: "TestClass.java"*/

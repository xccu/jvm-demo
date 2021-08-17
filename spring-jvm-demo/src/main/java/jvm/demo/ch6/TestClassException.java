package jvm.demo.ch6;

/**
 * 6-5 异常表运作演示
 * javap -verbose TestClassException.class
 * win10下需要用管理员打开cmd
 */
public class TestClassException {
    public int inc(){
        int x;
        try{
            x=1;
            return x;
        }catch (Exception e){
            x=2;
            return x;
        }finally {
            x=3;
        }
    }
}


/*输出结果
C:\>javap -verbose TestClassException.class
Classfile /C:/Users/xcy/Desktop/TestClassException.class
Last modified 2021-8-16; size 627 bytes
        MD5 checksum 004601cc282ddac0ee1458b70c276919
        Compiled from "TestClassException.java"
public class jvm.demo.ch6.TestClassException
        minor version: 0
        major version: 50
        flags: ACC_PUBLIC, ACC_SUPER
        Constant pool:
        #1 = Methodref          #4.#22         // java/lang/Object."<init>":()V
        #2 = Class              #23            // java/lang/Exception
        #3 = Class              #24            // jvm/demo/ch6/TestClassException
        #4 = Class              #25            // java/lang/Object
        #5 = Utf8               <init>
   #6 = Utf8               ()V
           #7 = Utf8               Code
           #8 = Utf8               LineNumberTable
           #9 = Utf8               LocalVariableTable
           #10 = Utf8               this
           #11 = Utf8               Ljvm/demo/ch6/TestClassException;
           #12 = Utf8               inc
           #13 = Utf8               ()I
           #14 = Utf8               x
           #15 = Utf8               I
           #16 = Utf8               e
           #17 = Utf8               Ljava/lang/Exception;
           #18 = Utf8               StackMapTable
           #19 = Class              #26            // java/lang/Throwable
           #20 = Utf8               SourceFile
           #21 = Utf8               TestClassException.java
           #22 = NameAndType        #5:#6          // "<init>":()V
           #23 = Utf8               java/lang/Exception
           #24 = Utf8               jvm/demo/ch6/TestClassException
           #25 = Utf8               java/lang/Object
           #26 = Utf8               java/lang/Throwable
           {
public jvm.demo.ch6.TestClassException();
        descriptor: ()V
        flags: ACC_PUBLIC
        Code:
        stack=1, locals=1, args_size=1
        0: aload_0
        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
        4: return
        LineNumberTable:
        line 3: 0
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        0       5     0  this   Ljvm/demo/ch6/TestClassException;

public int inc();
        descriptor: ()I
        flags: ACC_PUBLIC
        Code:
        stack=1, locals=5, args_size=1
        0: iconst_1
        1: istore_1
        2: iload_1
        3: istore_2
        4: iconst_3
        5: istore_1
        6: iload_2
        7: ireturn
        8: astore_2
        9: iconst_2
        10: istore_1
        11: iload_1
        12: istore_3
        13: iconst_3
        14: istore_1
        15: iload_3
        16: ireturn
        17: astore        4
        19: iconst_3
        20: istore_1
        21: aload         4
        23: athrow
        Exception table:
        from    to  target type
        0     4     8   Class java/lang/Exception
        0     4    17   any
        8    13    17   any
        17    19    17   any
        LineNumberTable:
        line 9: 0
        line 10: 2
        line 15: 4
        line 10: 6
        line 11: 8
        line 12: 9
        line 13: 11
        line 15: 13
        line 13: 15
        line 15: 17
        line 16: 21
        LocalVariableTable:
        Start  Length  Slot  Name   Signature
        2       6     1     x   I
        9       8     2     e   Ljava/lang/Exception;
        11       6     1     x   I
        0      24     0  this   Ljvm/demo/ch6/TestClassException;
        21       3     1     x   I
        StackMapTable: number_of_entries = 2
        frame_type = 72 */
/* same_locals_1_stack_item *//*

        stack = [ class java/lang/Exception ]
        frame_type = 72 */
/* same_locals_1_stack_item *//*

        stack = [ class java/lang/Throwable ]
        }
        SourceFile: "TestClassException.java"*/

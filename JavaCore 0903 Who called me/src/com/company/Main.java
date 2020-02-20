package com.company;

/*

0903 Who called me
Write five methods that call each other.
The method should return the line number of the code from which this method was called.
Use the function: element.getLineNumber ().

Requirements:
1. There should be 5 methods in the class (do not take into account the main method).
2. Each method should call the following: main call method1, method1 call method2, etc.
3. Each method should return the line number of the code from which this method was called.
4. To get the line number, use the getLineNumber method of the StackTraceElement class.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        method1();
    }
    public static int method1() {
        method2();
        StackTraceElement[] a = Thread.currentThread().getStackTrace();
        System.out.println("Я метод "+a[1].getMethodName());
        System.out.println("Меня вызвал "+a[2].getMethodName());
        System.out.println("Вызов произошел из строки номер "+a[2].getLineNumber());
        return  /*напишите тут ваш код*/ a[2].getLineNumber();
        //решение в одну строку:
        //return Thread.currentThread().getStackTrace()[2].getLineNumber();
        //дополнительно, как вызвать весь поток методов:
        //for (StackTraceElement b:a){
        //    System.out.println("Метод по очереди "+b.getMethodName());
        //}

    }
    public static int method2() {
        method3();
        StackTraceElement[] a = Thread.currentThread().getStackTrace();
        System.out.println("Я метод "+a[1].getMethodName());
        System.out.println("Меня вызвал "+a[2].getMethodName());
        System.out.println("Вызов произошел из строки номер "+a[2].getLineNumber());
        return  /*напишите тут ваш код*/ a[2].getLineNumber();
    }
    public static int method3() {
        method4();
        StackTraceElement[] a = Thread.currentThread().getStackTrace();
        System.out.println("Я метод "+a[1].getMethodName());
        System.out.println("Меня вызвал "+a[2].getMethodName());
        System.out.println("Вызов произошел из строки номер "+a[2].getLineNumber());
        return  /*напишите тут ваш код*/ a[2].getLineNumber();
    }
    public static int method4() {
        method5();
        StackTraceElement[] a = Thread.currentThread().getStackTrace();
        System.out.println("Я метод "+a[1].getMethodName());
        System.out.println("Меня вызвал "+a[2].getMethodName());
        System.out.println("Вызов произошел из строки номер "+a[2].getLineNumber());
        return  /*напишите тут ваш код*/ a[2].getLineNumber();
    }
    public static int method5() {
        StackTraceElement[] a = Thread.currentThread().getStackTrace();
        System.out.println("Я метод "+a[1].getMethodName());
        System.out.println("Меня вызвал "+a[2].getMethodName());
        System.out.println("Вызов произошел из строки номер "+a[2].getLineNumber());
        return  /*напишите тут ваш код*/ a[2].getLineNumber();
    }
}

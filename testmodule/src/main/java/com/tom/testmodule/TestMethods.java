package com.tom.testmodule;

/**
 * Created by TomLeisen on 2018/8/8 下午4:50
 * Email: xy162162a@163.com
 * Description:
 */
public class TestMethods {

    public static String test;
    public static String test2;
    private int one;
    private int two;


    public TestMethods() {
    }

    public static String getTest() {
        return test;
    }

    public static void setTest(String test) {
        TestMethods.test = test;
    }

    public static String getTest2() {
        return test2;
    }

    public static void setTest2(String test2) {
        TestMethods.test2 = test2;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }
}

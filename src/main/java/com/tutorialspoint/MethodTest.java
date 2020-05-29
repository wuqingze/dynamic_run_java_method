package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.reflect.Method;
import java.lang.reflect.Array;
import java.util.Arrays;
import com.tutorialspoint.util.Utils;
import java.util.Scanner;


import java.util.Scanner;

public class MethodTest{

    private Object o;

    public MethodTest(){
	System.out.println("constructor");
    }

    public MethodTest(byte i){
	this.o = i;
	System.out.println("constructor int"+i); 
    }

    public MethodTest(short i){
	this.o = i;
	System.out.println("constructor short"+i); 
    }

    public MethodTest(int i){
	this.o = i;
	System.out.println("constructor int"+i); 
    }

    public MethodTest(long i){
	this.o = i;
	System.out.println("constructor long"+i); 
    }

    public MethodTest(float i){
	this.o = i;
	System.out.println("constructor float"+i); 
    }

    public MethodTest(double i){
	this.o = i;
	System.out.println("constructor double"+i); 
    }

    public MethodTest(char i){
	this.o = i;
	System.out.println("constructor char"+i); 
    }

    public MethodTest(boolean i){
	this.o = i;
	System.out.println("constructor boolean"+i); 
    }

    public MethodTest(byte[] i){
	this.o = i;
	System.out.println("constructor byte[]"+Arrays.toString(i)); 
    }

    public MethodTest(short[] i){
	this.o = i;
	System.out.println("constructor short[]"+Arrays.toString(i)); 
    }

    public MethodTest(int[] i){
	this.o = i;
	System.out.println("constructor int[]"+Arrays.toString(i)); 
    }

    public MethodTest(long[] i){
	this.o = i;
	System.out.println("constructor long[]"+Arrays.toString(i)); 
    }

    public MethodTest(float[] i){
	this.o = i;
	System.out.println("constructor float[]"+Arrays.toString(i)); 
    }

    public MethodTest(double[] i){
	this.o = i;
	System.out.println("constructor double[]"+Arrays.toString(i)); 
    }

    public MethodTest(char[] i){
	this.o = i;
	System.out.println("constructor char[]"+Arrays.toString(i)); 
    }

    public MethodTest(boolean[] i){
	this.o = i;
	System.out.println("constructor boolean[]"+Arrays.toString(i)); 
    }

    public void intTest(int i){
	System.out.println(i);
    }

    public void testDouble(double i){
	System.out.println(i);
    }

    public void intTest(int[] i){
	System.out.println(Arrays.toString(i));
    }

    public void intTest(int[] i,int j ){
	System.out.println(Arrays.toString(i)+"-----j:"+j);
    }
    
    public void intTest(String i ){
	System.out.println(i);
	System.out.println(i);
    }
    
    public void intTest(float i){
	System.out.println(i);
	System.out.println("flaot:----------");
    }
    
    public void intTest(String i,String j ){
	System.out.println(i);
	System.out.println(j);
	System.out.println("i,j:----------");
    }

    
    public void intTest(boolean i){
	System.out.println("boolean："+i);
    }


    public void intTest(byte i){
	System.out.println("byte："+i);
    }

    public void intTest(short i){
	System.out.println("short："+i);
    }

    public void intTest(long i){
	System.out.println("long："+i);
    }


    public void intTest(char i){
	System.out.println("char："+i);
    }
    
    public void intTest(byte[] i){
	System.out.println("byte[]："+Arrays.toString(i));
    }
 
    public void intTest(short[] i){
	System.out.println("short[]："+Arrays.toString(i));
    }
    
    public void intTest(long[] i){
	System.out.println("long[]："+Arrays.toString(i));
    }

    public void intTest(float[] i){
	System.out.println("float[]："+Arrays.toString(i));
    }

    public void intTest(double[] i){
	System.out.println("double[]："+Arrays.toString(i));
    }

    public void intTest(char[] i){
	System.out.println("char[]："+Arrays.toString(i));
    }

    public void intTest(boolean[] i){
	System.out.println("boolean[]："+Arrays.toString(i));
    }

    public Object printO(){
	System.out.println(this.o);
	return this.o;
    }
}


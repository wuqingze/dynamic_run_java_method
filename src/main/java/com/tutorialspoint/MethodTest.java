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
}


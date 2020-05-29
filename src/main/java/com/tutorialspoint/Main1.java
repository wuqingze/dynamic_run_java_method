package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.reflect.Method;
import java.lang.reflect.Array;
import java.util.Arrays;
import com.tutorialspoint.util.Utils;
import java.util.Scanner;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
import java.lang.reflect.*;
import com.alibaba.fastjson.JSON;


import java.util.Scanner;

public class Main1{
    
    public Main1(boolean n){
	System.out.println(n);
    }

    public static void main(String[] args) throws Exception{
//            ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//            Object objectBean = context.getBean("methodtest");
//	    Arrays.stream(objectBean.getClass().getDeclaredMethods()).forEach(x -> {
//		System.out.println("==========methodName:"+x.getName());
//		System.out.println("==========parameterTypes"+Arrays.toString(x.getParameterTypes()));
//	    });


	//System.out.println(Object.class.getResource(".").getPath());
	//System.out.println(Object.class.getResource("") == null);
	//System.out.println(System.getProperty("user.dir"));

	//Object[] _args = new Object[1];
	//_args[0] = new Integer("1024");

//	System.out.println(
//	    Class.forName("com.tutorialspoint.Test").
//		getConstructor(int.class).
//		    newInstance(_args)
//	);

//        System.out.println(
//	    Class.forName("com.tutorialspoint.Test").
//		getConstructor(int.class).
//		    newInstance(_args)
//	);

	//Arrays.stream(Test.class.getConstructors()).forEach(constructor -> { 
	//    System.out.println(
	//        Arrays.stream(constructor.getParameterTypes())
	//	.map(type -> type.getName())
	//	.collect(Collectors.toList())
	//    );
	//});	


        //Arrays.stream(Test.class.getConstructors()).forEach(constructor -> { 
	//    System.out.println(
	//        Arrays.stream(constructor.getParameterTypes())
	//	.map(type -> type.getCanonicalName())
	//	.collect(Collectors.toList())
	//    );
	//});	

	
	//System.out.println(Arrays.toString(Main1.class.getConstructors()));
	//System.out.println(boolean.class.getCanonicalName());
	//for(Constructor c: Main1.class.getConstructors()){
	//    Class[] clazzs = c.getParameterTypes();
	//    for(Class clazz : clazzs){
	//	System.out.println(clazz.getCanonicalName());
	//    }
	//}

	//int[] a= new int[]{1,2,3,4};
	//int[] b= Arrays.stream(a).map(n->n).toArray();
	//System.out.println(JSON.toJSONString(a));

	Object[] is = new Object[1];
	is[0] = new Integer("1024");
	System.out.println(JSON.toJSONString(is));
    }
}



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


import java.util.Scanner;

public class Main1{

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

	
	System.out.println(Arrays.toString(Main1.class.getConstructors()));
    }
}



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

//	Object[] is = new Object[1];
//	is[0] = new Integer("1024");
//	System.out.println(JSON.toJSONString(is));

	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	Args _args = null; 
	try{ _args = (Args)context.getBean("test41");}
	catch(Exception e){
	    throw new Exception("引用在配置文件中未定义或定义出错\n"+e.getMessage());
	}
	MethodTest m = new MethodTest();

	//Object[] aa = new HelloWorld[2];
	//HelloWorld a1 = new HelloWorld();
	//a1.message = "ajflaj";
	//aa[0] = a1;
	//HelloWorld a2 = new HelloWorld();
	//a2.message = "ajflaj";
	//aa[1] = a2;
	//System.out.println("jkldsjfalj=============9999988888888889");

	Method method =  MethodTest.class.getMethod("printO", HelloWorld[].class);

	Arrays.stream(_args.values).forEach(e-> System.out.println(e.getClass().getCanonicalName()));
	Arrays.stream(method.getParameterTypes()).forEach(e -> System.out.println(e.getCanonicalName()));
	System.out.println("args values class"+_args.values.getClass().getCanonicalName());

	method.setAccessible(true);
	Object invokearg = _args.values.length==1?_args.values[0]:_args.values;
	//System.out.println("invoke args"+JSON.toJSONString(invokearg));
	System.out.println("args values "+JSON.toJSONString(_args.values));

        method.invoke(m,invokearg);
	method.invoke(m,  _args.values);

	String  s= "helrjwej";
        
	System.out.println((String)s);
	//MethodTest m = new MethodTest();
	//HelloWorld a1 = new HelloWorld();
	//a1.message = "ajflaj";
	//Method method =  MethodTest.class.getMethod("printO", HelloWorld.class);
	//method.invoke(m,a1);
    }
}



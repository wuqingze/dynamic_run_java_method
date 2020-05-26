package com.tutorialspoint.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.reflect.*;
import com.tutorialspoint.Args;
import com.tutorialspoint.MethodTest;
import java.util.*;


public class Utils{

   public final static Map<String,String> TYPE_MAP = new HashMap<String, String>();

   static{
	TYPE_MAP.put("byte","java.lang.Byte");
	TYPE_MAP.put("short","java.lang.Short");
	TYPE_MAP.put("int","java.lang.Integer");
	TYPE_MAP.put("long","java.lang.Long");
	TYPE_MAP.put("float", "java.lang.Float");
	TYPE_MAP.put("double","java.lang.Double");
	TYPE_MAP.put("char","java.lang.Character");
	TYPE_MAP.put("boolean","java.lang.Boolean");
	TYPE_MAP.put("byte[]","java.lang.Byte[]");
	TYPE_MAP.put("short[]","java.lang.Short[]");
	TYPE_MAP.put("int[]","java.lang.Integer[]");
	TYPE_MAP.put("long[]","java.lang.Long[]");
	TYPE_MAP.put("float[]", "java.lang.Float[]");
	TYPE_MAP.put("double[]","java.lang.Double[]");
	TYPE_MAP.put("char[]","java.lang.Character[]");
	TYPE_MAP.put("boolean","java.lang.Boolean[]");
   }
   
    public static Class forName(String className) throws ClassNotFoundException{
        if(className.indexOf('.') <0){
	    className = className.toLowerCase();
	}
	switch(className){
	    case "byte":
		return byte.class;
	    case "short":
		return short.class;
	    case "int":
		return int.class;
	    case "long":
		return long.class;
	    case "float":
		return float.class;
	    case "double":
		return double.class;
	    case "char":
		return char.class;
	    case "string":
		return String.class;
	    case "byte[]":
		return byte[].class;
	    case "short[]":
		return short[].class;
	    case "int[]":
		return int[].class;
	    case "long[]":
		return long[].class;
	    case "float[]":
		return float[].class;
	    case "double[]":
		return double[].class;
	    case "char[]":
		return char[].class;
	    case "string[]":
		return String[].class;

	    default:
		return Class.forName(className);
	}
    }


    public static Object exec(String objectName, String methodName) throws Exception{
	System.out.println(String.format("===================objectName:%s\tmethodName:%s",objectName, methodName));
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Object objectBean = null;
	try{ objectBean = context.getBean(objectName);}
	catch(Exception e){
	    throw new Exception(String.format("================"+objectName+"引用未在配置文件中定义"));
	}

	try{ context.getBean(methodName);}
	catch(Exception e){
	    System.out.println("================="+methodName+"引用未在配置文件中定义,调用默认类方法"+methodName);
	    return objectBean.getClass().getMethod(methodName).invoke(objectBean);
	}
	
	Args methodBean = (Args) context.getBean(methodName);
	Class[] methodType = new Class[methodBean.values==null?0:methodBean.values.length];
	if(methodBean.values != null){
	    for(int i=0;i<methodBean.values.length;i++){
		methodType[i] = methodBean.values[i].getClass();
	    }
	}
	for(Method method: objectBean.getClass().getDeclaredMethods()){
	   if(method.getName().equals(methodBean.methodName)){
		if(classArrayEquals(methodType, method.getParameterTypes())){
		    System.out.println("=============执行程序:"+
			String.format("类名:%s\t方法名:%s\t方法参数:%s", 
			    objectBean.getClass().getName(),
			    methodBean.getMethodName(), 
			    Arrays.toString(method.getParameterTypes())));
		    return method.invoke(objectBean, methodBean.values);
	        } 
	    }
	}
	throw new Exception(
	   String.format("==========找不到方法,类名:%s\t方法名:%s\t方法参数:%s", 
	       objectBean.getClass().getName(),
	       methodBean.getMethodName(), 
	       Arrays.toString(methodType)));
    }

    public static boolean classArrayEquals(Class[] a1, Class[] a2){
	if(null == a1 && null == a2){return true;}
	if(null == a1 || null == a2){return false;}
	if(a1.length != a2.length){return false;}

	for(int i=0;i<a1.length;i++){
	    String name1 = a1[i].getCanonicalName();
	    String name2 = a2[i].getCanonicalName();
	    if(name1.equals(name2)){ continue;}else{
		name1 = Optional.ofNullable(TYPE_MAP.get(name1)).orElse(name1);
		name2 = Optional.ofNullable(TYPE_MAP.get(name2)).orElse(name2);
		if(!name1.equals(name2)){ return false;}
	    }
	}
	return true;
   }
}

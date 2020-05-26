package com.tutorialspoint;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;
import java.lang.reflect.*;
import com.tutorialspoint.Args;
import java.util.*;

public class InitHelloWorld implements BeanPostProcessor {
    
   public final static Map<String,String> TYPE_MAP = new HashMap<String, String>();

   static{
	TYPE_MAP.put("byte","java.lang.Byte");
	TYPE_MAP.put("short","java.lang.Short");
	TYPE_MAP.put("int","java.lang.Integer");
	TYPE_MAP.put("long","java.lang.Long");
	TYPE_MAP.put("float", "Float");
	TYPE_MAP.put("double","Double");
	TYPE_MAP.put("char","java.lang.Character");
	TYPE_MAP.put("bool","java.lang.Boolean");
	TYPE_MAP.put("byte[]","java.lang.Byte[]");
	TYPE_MAP.put("short[]","java.lang.Short[]");
	TYPE_MAP.put("int[]","java.lang.Integer[]");
	TYPE_MAP.put("long[]","java.lang.Long[]");
	TYPE_MAP.put("float[]", "Float[]");
	TYPE_MAP.put("double[]","Double[]");
	TYPE_MAP.put("char[]","java.lang.Character[]");
   }
   public Object postProcessBeforeInitialization(Object bean, String beanName) 
      throws BeansException {
      
      System.out.println("BeforeInitialization : " + beanName);
      return bean;  // you can return any other object as well
   }

   public Object postProcessAfterInitialization(Object bean, String beanName) 
      throws BeansException{
      try{ 
	  //if(beanName.startsWith("arg")){
	  if(bean instanceof com.tutorialspoint.Args){
	      Method setTypes = bean.getClass().getDeclaredMethod("setTypes", java.lang.Class[].class);

	      Object[] args = (Object[]) bean.getClass().getDeclaredMethod("getValues").invoke(bean);
	      Class[] valueTypes = new Class[args.length];
	      for(int i=0;i<args.length;i++){
	        valueTypes[i] = args[i].getClass();
	      }

	      String methodName = ((Args) bean).methodName;
	      List<Method> methodList = new ArrayList<Method>();
	      for(Method m : bean.getClass().getMethods()){
	          if(classArrayEquals(valueTypes, m.getParameterTypes())){
		      setTypes.invoke(bean, (Object)(m.getGenericParameterTypes()));
		  }
	      }
	 }
      }catch(Exception e){System.out.println("init failured---------"+e.getMessage());} 
      System.out.println("AfterInitialization : " + beanName);
      return bean;  // you can return any other object as well
   }

   private boolean classArrayEquals(Class[] a1, Class[] a2){
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

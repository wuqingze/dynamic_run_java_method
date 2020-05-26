package com.tutorialspoint;

import org.junit.Test; 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.reflect.Method;
import java.lang.reflect.Array;
import java.util.Arrays;
import com.tutorialspoint.util.Utils;
import java.util.Scanner;

public class HelloWorldTest{

    @Test
    public void test00(){
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
	System.out.println(obj.namesList);
    }

    @Test
    public void test01() throws Exception{
//	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        Object o = context.getBean("helloWorld");
//	Method m = o.getClass().getDeclaredMethod("getMessage");
//	m.invoke(o);
    }

    @Test
    public void test02() throws Exception{
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Object o = context.getBean("arg1");
	Method m = o.getClass().getDeclaredMethod("getValues");
	Object[] ary = (Object[]) m.invoke(o);
	System.out.println(Arrays.toString(ary)); 
   }

   @Test
   public void test03(){
	Object[] o =new Object[3];
	o[0] =  new Integer("1024");
	o[1] = new String("helloworld");
	o[2] = new String[]{"j","k","l"};
	for(Object oo : o){
	    String canonialName = oo.getClass().getCanonicalName();
	    String name = oo.getClass().getName();
	    try{
		System.out.println("---------"+canonialName);
		Class.forName(canonialName);
		if(canonialName.startsWith("L[")){
		    Array.newInstance(Class.forName(canonialName), 3);
		}
	    } catch (Exception e){ System.out.println("exception---"+canonialName);}

	    try{
		System.out.println("---------"+name);
		Class.forName(name);
	    } catch (Exception e){ System.out.println("exception---"+name);}
	}
    }

    @Test
    public void test04() throws Exception{
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Object o = context.getBean("arg1");
	Method m = o.getClass().getDeclaredMethod("getValues");
	Object[] ary = (Object[]) m.invoke(o);
	System.out.println("=============="+Arrays.toString(ary)); 
	m = o.getClass().getDeclaredMethod("getTypes");
	ary = (Object[]) m.invoke(o);
	System.out.println("=============="+Arrays.toString(ary)); 
   }

    @Test
    public void test05() throws Exception{
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Args o = (Args)context.getBean("arg3");
	System.out.println(Arrays.toString(o.getValues()));
	for(Object x: o.getValues()){
	    System.out.println(x.getClass().getName());
	}
    } 

    @Test
    public void test06() throws Exception{
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Args o = (Args)context.getBean("arg3");
	System.out.println(Arrays.toString(o.getValues()));
	System.out.println(Arrays.toString(o.getTypes()));
    }


    @Test
    public void test07() throws Exception{
        Object[] o = (Object[]) Utils.exec("arg3", "getValues");
	for(Object oo: o){
	    System.out.println(oo);
	}
    }


    @Test
    public void test08() throws Exception{
	Scanner in = new Scanner(System.in);
	while(in.hasNextLine()){
	    String argsString = in.nextLine();
	    System.out.println(argsString);
	}
        //Scanner in = new Scanner(System.in);
	//while(in.hasNextLine()){
	//    String argString = in.nextLine();
	//    System.out.println(argString);
	    //String[] args = argString.split(" ");
            //Object[] o = (Object[]) Utils.exec(args[0], args[1]);
	    //for(Object oo: o){
	    //    System.out.println(oo);
	    //}
	//kk}
    }
}

package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.reflect.Method;
import java.lang.reflect.Array;
import java.util.Arrays;
import com.tutorialspoint.util.Utils;
import java.util.Scanner;


import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws Exception{
	  //  Scanner in = new Scanner(System.in);
	  //  while(in.hasNextLine()){
	  //      String argString = in.nextLine();
	  //      args = argString.split(" ");
          //      try{	
          //          Object result = Utils.exec(args[0], args[1]);
	  //          if(result instanceof Object[]){
	  //              for(Object oo: (Object[])result){
	  //                  System.out.println(oo);
	  //              }
	  //          }else{
	  //              System.out.println("===================程序执行结果:"+result);
	  //          }
	  //      } catch(Exception e){ System.out.println(e.getMessage());}
          //  }   

//	    Utils.exec("methodtest", "test00");
 //           ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
  //          Object objectBean = context.getBean("methodtest");
//
//	    System.out.println(objectBean == null);

	    Scanner in = new Scanner(System.in);
	    System.out.println("输入参数:");
	    while(in.hasNextLine()){
	        String arg = in.nextLine().trim();
                try{	
                    Object result = Utils.exec(arg);
		    String out = result instanceof Object[]?Arrays.toString((Object[]) result):result.toString(); 
	            System.out.println("===================程序执行结果:"+out==null?"":out);
	        } catch(Exception e){ System.out.println(e.getMessage());}
	        System.out.println("输入参数:");
           }

    }
}



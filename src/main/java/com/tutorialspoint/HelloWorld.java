package com.tutorialspoint;

import java.util.List;

public class HelloWorld {
   public String message;

   public List<String> namesList;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }

   public void setNamesList(List<String> namesList){
	this.namesList = namesList;
    }

    public List<String> getNamesList(){
	return this.namesList;
    }
}

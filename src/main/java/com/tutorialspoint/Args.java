package com.tutorialspoint;

public class Args{

    public Object[] values;

    public Class[] types;

    public String methodName;

    public String className;

    public Object[] constructorArgs;

    public Object[] getValues(){
	return this.values;
    }

    public void setValues(Object[] values){
	this.values = values;
    }

    public Class[] getTypes(){
	return this.types;
    }

    public void setTypes(Class[] types){
	this.types = types;
    }

    public void setMethodName(String methodName){ this.methodName = methodName;}

    public String getMethodName(){ return this.methodName;}

    public String getClassName(){ return this.className;}

    public void setClassName(String className){ this.className = className;}

    public Object[] getConstructorArgs(){ return this.constructorArgs;}

    public void setConstructorArgs(Object[] args){ this.constructorArgs = args;}
}

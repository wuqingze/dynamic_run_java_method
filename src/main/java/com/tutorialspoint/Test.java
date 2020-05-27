package com.tutorialspoint;

class Test{
    
    private int i;

    public Test(){
	this.i = 1024;
    }

    public Test(int i){
	this.i = i;
    }

    public Test(int[] i){
    }

    public String toString(){
	return "Test i="+this.i;
    }
}

package com.tutorialspoint.util;

import org.junit.Test;
import static org.junit.Assert.*;

import com.tutorialspoint.util.MavenProjectClassLoader;

public class MavenProjectClassLoaderTest{
    
    /**
     * test utils forName method
     * */
    @Test
    public void test00() throws ClassNotFoundException{
	MavenProjectClassLoader classLoader = new MavenProjectClassLoader();
	Class c1 = classLoader.findClass("com.tutorialspoint.Args");
	assertNotNull(c1);	
	//assertEquals(com.tutorialspoint.Args.class, c1);
	assertEquals("com.tutorialspoint.Args", c1.getName());
    }
}

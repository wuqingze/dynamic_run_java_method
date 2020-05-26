package com.tutorialspoint.util;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilsTest{
    
    /**
     * test utils forName method
     * */
    @Test
    public void test00() throws ClassNotFoundException{
        assertEquals(byte.class, Utils.forName("byte"));
        assertEquals(short.class, Utils.forName("short"));
        assertEquals(int.class, Utils.forName("int"));
        assertEquals(long.class, Utils.forName("long"));
        assertEquals(float.class, Utils.forName("float"));
        assertEquals(double.class, Utils.forName("double"));
        assertEquals(char.class, Utils.forName("char"));
        assertEquals(String.class, Utils.forName("string"));
        assertEquals(byte.class, Utils.forName("BYTE"));
        assertEquals(short.class, Utils.forName("SHORT"));
        assertEquals(int.class, Utils.forName("INT"));
        assertEquals(long.class, Utils.forName("LONG"));
        assertEquals(float.class, Utils.forName("FLOAT"));
        assertEquals(double.class, Utils.forName("DOUBLE"));
        assertEquals(char.class, Utils.forName("CHAR"));
        assertEquals(String.class, Utils.forName("STRING"));

        assertEquals(java.lang.Integer.class, Utils.forName("java.lang.Integer"));
        assertEquals(java.util.List.class, Utils.forName("java.util.List"));
        assertEquals(java.util.Map.class, Utils.forName("java.util.Map"));

        assertEquals(int[].class, Utils.forName("int[]"));
//	assertEquals(java.lang.String[].class, Utils.forName("[java.lang.String"));
    }
}

package com.tutorialspoint.util;

import java.nio.file.*;
import java.io.*;
import java.net.*;

public class MavenProjectClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) {
        String myPath = "file:///"+System.getProperty("user.dir")+ "/target/classes/"
	    + name.replace(".","/") + ".class";
        System.out.println("===================classpath:"+myPath);
        byte[] cLassBytes = null;
        Path path = null;
        try {
            path = Paths.get(new URI(myPath));
            cLassBytes = Files.readAllBytes(path);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        Class clazz = defineClass(name, cLassBytes, 0, cLassBytes.length);
        return clazz;
    }
}

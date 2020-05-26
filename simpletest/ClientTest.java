import java.util.*;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class ClientTest {
    
    public static void p(Object o){
	System.out.println(o);
    }

    public String testType(String a1, Integer a2, List<String> a3, char[] a5){

	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a5);

	return "helloworld";
    }

    public void testClass(Class[] args){
	System.out.println(Arrays.toString(args));
    }

    public void testObject(Object[] args){
	System.out.println(Arrays.toString(args));
    }


    public void testIntDouble(int i, double j ){
	System.out.println(i+"-----------"+j);
    }

    public void testArrayInt(int[] a ){
    }

    public void testArrayInteger(java.lang.Integer[] a ){
    }

    public void testListInteger(java.util.List<Integer> l){}

    public void test00(List<String> s){}

    //public void test00(List<Integer> s){}

    public void test00(ArrayList<String> s){}

    public void test00(int[] s){}

    public void test00(Integer[] s){}

    public void test01(){ System.out.println("test01");}

    public static void main(String args[]) throws Exception {
//        Tester test = new Tester();
//        Tester[] tests = new Tester[0];
//        Class<?> c1 = tests.getClass().getComponentType();
//        Class<?> c2 = Tester.class;
//        Class<?> c3 = test.getClass();
//	Class arrayOfFooClass = java.lang.reflect.Array.newInstance(
//	    Class.forName("java.lang.Integer"), 0).getClass();
//        Object[] objArray = (Object[])java.lang.reflect.Array.newInstance(
//	    Class.forName("java.lang.Integer"), 3);
//	Array.set(objArray, 0, 1);
//	Array.set(objArray, 1, 2);
//	Array.set(objArray, 2, 3);
//
//        System.out.println(c3.getName());
//        System.out.println(c1.getName());
//        System.out.println(c2.getName());
//        System.out.println(c3.getName());
//        System.out.println(arrayOfFooClass.getName());
//        System.out.println(Arrays.toString(objArray));
//
	
	//ClientTest ct = new ClientTest();
//	Class[] at = new Class[]{java.lang.String.class, java.lang.Integer.class, java.util.List.class,
//	Array.newInstance(char.class,0).getClass()};
//	Method m = ct.getClass().getDeclaredMethod("testType", at);
//	Method m = ct.getClass().getDeclaredMethod("testType");
//	Object r = m.invoke(ct, "helloworld----", 1, Arrays.asList("1","2","3"), new char[]{0x1,0x2,0x3});
//        System.out.println(r);
	//ClientTest ct = new ClientTest();
	//Method m = ct.getClass().getDeclaredMethod("testClass", Array.newInstance(Class.forName("java.lang.Class"), 0).getClass());
	//Method m = ct.getClass().getDeclaredMethod("testClass", java.lang.Class[].class);
	//Method m = ct.getDeclaredMethod("testType");
	//Class[] at = new Class[]{java.lang.String.class, java.lang.Integer.class, java.util.List.class,
        //	Array.newInstance(char.class,0).getClass()};
	//m.invoke(ct, at);
	//m.invoke(ct);



//	ClientTest ct = new ClientTest();
//	Method m = ct.getClass().getDeclaredMethod("testObject", java.lang.Object[].class);
//	Object[] at = new Object[]{java.lang.String.class, java.lang.Integer.class, java.util.List.class};
//	m.invoke(ct, at);
//
//	ClientTest ct = new ClientTest();
//	Method m = ct.getClass().getDeclaredMethod("testStringArray", java.lang.String[].class);
//	String[] at = new String[]{"hello", "world", "wuqingze"};
//	m.invoke(ct, (Object)at);
//

//	ClientTest ct = new ClientTest();
//	Method m = ct.getClass().getDeclaredMethod("testInt",int.class );
//	m.invoke(ct, 1024);

//	System.out.println(int.class.getName());
//	System.out.println(java.lang.Integer.class.getName());
	
//	for(Method m: ClientTest.class.getMethods()){
//	    p(String.format("methomdname:%s---------parametertype:%s",m.getName(), Arrays.toString(m.
//	    getGenericParameterTypes())));
//	}
//
//	System.out.println(int.class instanceof Object);
//	System.out.println(int.class.equals(int.class));
//	System.out.println(int.class.equals(java.lang.Integer.class));

//	ClientTest ct = new ClientTest();
//	Method m = ct.getClass().getDeclaredMethod("testIntDouble",int.class, double.class );
//	m.invoke(ct, new Integer("1024"), new Double("2048.00"));

//	System.out.println(int.class instanceof java.lang.Integer);

	//for(Method m: ClientTest.class.getMethods()){
	//    p("==========="+m.getName());
	//    Class[] t = m.getParameterTypes();
	//    for(Class c: t){ 
	//        //p(c.getName());
	//	p(c.getCanonicalName());
	//    }
	//    p("------------------------------------------------");
	//}

	//Method m1 = ClientTest.class.getMethod("test00", List.class);
	//for(Class c: m1.getParameterTypes()){
	//    p(c.getCanonicalName());
	//}
	//Method m2 = ClientTest.class.getMethod("test00", ArrayList.class);
	//for(Class c: m2.getParameterTypes()){
	//    p(c.getCanonicalName());
	//}

	//Method m1 = ClientTest.class.getMethod("test00", int[].class);
	//for(Class c: m1.getParameterTypes()){
	//    p(c.getCanonicalName());
	//}
	//Method m2 = ClientTest.class.getMethod("test00", Integer[].class);
	//for(Class c: m2.getParameterTypes()){
	//    p(c.getCanonicalName());
	//}
	//Character c;
	//new HashMap<String, String>();

	//Object o = new ClientTest();
	//for(Method m : o.getClass().getDeclaredMethods()){
	//    System.out.println(m.getName());
	//}

	Method m = ClientTest.class.getMethod("test01");
	System.out.println(Arrays.toString(m.getParameterTypes()));
	m.invoke(new ClientTest(),null);
    }
}

class Tester {
    private String name;
    private String mem;
}

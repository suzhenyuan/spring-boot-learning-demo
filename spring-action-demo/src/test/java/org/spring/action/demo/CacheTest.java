package org.spring.action.demo;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;


public class CacheTest {

	public static void main(String[] args){
		/*System.out.println(findResult());
		//RedisCacheManager m = new RedisCacheManager();
		String[] names = new String[]{"1","2","3"};
		List<String> list = Arrays.asList(names);
		System.out.println(list.getClass());
		list.add("4");
		System.out.println(list);
		List<String> ll = new ArrayList<String>();
		
		StringBuilder sb = new StringBuilder();
		StringBuffer sbf = new StringBuffer();
		
		Vector<String> v = new Vector<String>();
		
		*/
		/*
		Map<Integer, Object> map = new HashMap<Integer, Object>();
		for(int i=0; i< 100; i++){
			map.put(i, i+"");
		}
		
		for(Integer key:map.keySet()){
			System.out.printf("%s", key);
		}
		
		*/
		/*Integer c=new Integer(10);
		System.out.println(comparableClassFor(c));
		
		System.out.println(tableSizeFor(100));
		*/
		/*float f = 0.1f/0.0f;
		System.out.println(f);
		
		
		Map<Integer, Object> map = new HashMap<Integer, Object>();
		*/
		/*int len=11;
		for(int i=1;i<10; i++){
			len = (len<<1)+1;
			System.out.println(len);
			
		}*/
		Hashtable<Integer, Integer> tb =new Hashtable<Integer, Integer>();
		for(int i=0; i<20; i++){
			tb.put(i, i);
		}
 	}
	
	static Class<?> comparableClassFor(Object x) {
	        if (x instanceof Comparable) {
	            Class<?> c; Type[] ts, as; Type t; ParameterizedType p;
	            if ((c = x.getClass()) == String.class) // bypass checks
	                return c;
	            if ((ts = c.getGenericInterfaces()) != null) {
	                for (int i = 0; i < ts.length; ++i) {
	                    if (((t = ts[i]) instanceof ParameterizedType) &&
	                        ((p = (ParameterizedType)t).getRawType() ==
	                         Comparable.class) &&
	                        (as = p.getActualTypeArguments()) != null &&
	                        as.length == 1 && as[0] == c) // type arg is c
	                        return c;
	                }
	            }
	        }
	        return null;
	    }
	static final int tableSizeFor(int cap) {
	        int n = cap - 1;
	        System.out.println(n);
	        n |= n >>> 1;
	        System.out.println(n);
	        n |= n >>> 2;
	        System.out.println(n);
	        n |= n >>> 4;
	        System.out.println(n);
	        n |= n >>> 8;
	        System.out.println(n);
	        n |= n >>> 16;
	        System.out.println(n);
	        return (n < 0) ? 1 : (n >= (1<<30)) ? (1<<30) : n + 1;
	    }
	@SuppressWarnings("finally")
	public static Integer findResult(){
		Integer val = 5;
		try{
			return val = 6;
			
		}catch(Exception ee){
			return val = 7;
		}finally {
			return val=8;
		}
	}
}

package com.xworkz.maps;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AdharMobileNoTester {

	public static void main(String[] args) {
	     Map<String, String> adharmobileno = new HashMap<String, String>();
	     adharmobileno.put("876543222","8496041245");
	     adharmobileno.put("876543223","9980096453");
	     adharmobileno.put("876543224","9008167096");
	     adharmobileno.put("","8456978412");
      
	     System.out.println(adharmobileno.size());
	     System.out.println("*************");
	     System.out.println(adharmobileno.containsKey(876543222l));
         System.out.println("**************");
         System.out.println(adharmobileno.containsValue(8496041245l));
         System.out.println("**************");
         
         Set<String> keyset = adharmobileno.keySet();
         Collection<String> values = adharmobileno.values();
         
         Iterator<String> itrvalue = values.iterator();
         while(itrvalue.hasNext()) {
        	 String str = itrvalue.next();
        	 System.out.println(str);
        	 
         }
         System.out.println("****************");
         Iterator<String> itrValue = keyset.iterator();
         while(itrValue.hasNext()) {
        	 String stringvalue = itrValue.next();
        	 System.out.println(stringvalue);
         }
         System.out.println("************");
         Iterator<String> itr = keyset.iterator();
         while(itr.hasNext()) {
        	 String string = itr.next();
        	 String value = adharmobileno.get(string);
        	 System.out.println(string + " " +value);
         }
         System.out.println("*****************");
         adharmobileno.remove("876543225");
         System.out.println(adharmobileno.size());
	}

}
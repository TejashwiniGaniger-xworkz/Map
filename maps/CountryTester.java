package com.xworkz.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryTester {

	public static void main(String[] args) {
     Map<String, String> countryPopulation = new HashMap<String, String>();
     countryPopulation.put("India", "121crore");
     countryPopulation.put("USA", "331million");
     countryPopulation.put("Rashya", "14.6crore");
     countryPopulation.put("China", "144crore");
     countryPopulation.put("Singapore", "5.8crore");
     
     System.out.println(countryPopulation.size());
     System.out.println("************");
     System.out.println(countryPopulation.containsKey("USA"));
     System.out.println("************");
     System.out.println(countryPopulation.containsValue("121crore"));
     System.out.println("*************");
     
     Set<String> keyset = countryPopulation.keySet();
     Collection<String> values = countryPopulation.values();
     
     Iterator<String> itrValue = values.iterator();
     while(itrValue.hasNext()) {
    	 String str = itrValue.next();
    	 System.out.println(str);
     }
     System.out.println("***************");
     Iterator<String> itrvalue = keyset.iterator();
     while(itrvalue.hasNext()) {
    	 String strval = itrvalue.next();
    	 System.out.println(strval);
     }
     System.out.println("**************");
     Iterator<String> itr = keyset.iterator();
     while(itr.hasNext()) {
    	 String string = itr.next();
    	 String value = countryPopulation.get(string);
    	 System.out.println(string);
     }
     System.out.println("****************");
     countryPopulation.remove("Rashya");
     System.out.println(countryPopulation.size());
}
}
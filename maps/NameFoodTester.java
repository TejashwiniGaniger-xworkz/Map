package com.xworkz.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NameFoodTester {

	public static void main(String[] args) {
		Map<String, String> namefood = new HashMap<String, String>();
		namefood.put("Teju", "Panipuri");
		namefood.put("Sahana", "Masalapuri");
		namefood.put("Harsha", "sev-puri");
		namefood.put("Anusha", "jamun");
		namefood.put("Rakshita", "gobi");
		namefood.put("Danya", "pizza");
		namefood.put("Shantanu", "sandwitch");
		
		System.out.println(namefood.size());
		System.out.println("*********");
		System.out.println(namefood.containsKey("Teju"));
		System.out.println("**********");
		System.out.println(namefood.containsValue("sandwitch"));
		
		Set<String> keyset = namefood.keySet();
		Collection<String> values = namefood.values();
		
		Iterator<String> itrValue = values.iterator();
		while(itrValue.hasNext()) {
			String str = itrValue.next();
			System.out.println(str);
		}
		System.out.println("*****************");
		Iterator<String> itrvalue = keyset.iterator();
		while(itrvalue.hasNext()) {
			String stringvalue = itrvalue.next();
			System.out.println(stringvalue);
		}
		System.out.println("*****************");
		Iterator<String> itr = keyset.iterator();
		while(itr.hasNext()) {
			String string = itr.next();
			String value = namefood.get(string);
			System.out.println(string + " " +value);
		}
		System.out.println("*****************");
		namefood.remove("Anusha");
		System.out.println(namefood.size());
	}

}

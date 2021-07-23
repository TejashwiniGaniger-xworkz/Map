package com.xworkz.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GovtOfficialSalaryTester {

	public static void main(String[] args) {
		Map<String, String> govtoffice = new HashMap<String, String>();
		govtoffice.put("ITDept", "60000");
		govtoffice.put("ForestDept", "65000");
		govtoffice.put("AgricultureDept", "700000");
		govtoffice.put("RailwayDept", "55000");
		govtoffice.put("PostDept", "35000");
		
		
		System.out.println(govtoffice.size());
		System.out.println("*********");
		System.out.println(govtoffice.containsKey("ForestDept"));
		System.out.println("**********");
		System.out.println(govtoffice.containsValue("35000"));
		
		Set<String> keyset = govtoffice.keySet();
		Collection<String> values = govtoffice.values();
		
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
			String value = govtoffice.get(string);
			System.out.println(string + " " +value);
		}
		System.out.println("*****************");
		govtoffice.remove("PostDept");
		System.out.println(govtoffice.size());
	}

}

package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GovernmentTester {

	public static void main(String[] args) {

		Map<String, Double> officialAndSalary = new HashMap<String, Double>();
		officialAndSalary.put("President", 500000d);
		officialAndSalary.put("PM", 280000d);
		officialAndSalary.put("Vice President", 400000d);
		officialAndSalary.put("Governer", 350000d);
		officialAndSalary.put("CM", 200000d);

		System.out.println("total map size:" + officialAndSalary.size());

		Set<String> set = officialAndSalary.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String itrKey = itr.next();
			System.out.println("key:" + itrKey);
			Double value = officialAndSalary.get(itrKey);
			System.out.println("key and value:" + itrKey + " " + value);
		}

		Collection<Double> value = officialAndSalary.values();
		Iterator<Double> itr1 = value.iterator();
		while (itr1.hasNext()) {
			Double itrValue = itr1.next();
			System.out.println("value:" + itrValue);
		}

	}

}

package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryTester {

	public static void main(String[] args) {

		Map<String, Double> nameAndPopulationMap = new HashMap<String, Double>();

		nameAndPopulationMap.put("India", 138.000d);
		nameAndPopulationMap.put("China", 143.93d);
		nameAndPopulationMap.put("Brazil", 21.255d);
		nameAndPopulationMap.put("Japan", 12.64761d);
		nameAndPopulationMap.put("Egypt", 102.3478d);

		System.out.println("total map size:" + nameAndPopulationMap.size());
		boolean contains = nameAndPopulationMap.containsKey("India");
		System.out.println("key contained in map:" + contains);

		boolean containsValue = nameAndPopulationMap.containsValue(126.4761d);
		System.out.println("value contained in map:" + containsValue);

		Set<String> set = nameAndPopulationMap.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String itrKey = itr.next();
			System.out.println("key:" + itrKey);
			Double value = nameAndPopulationMap.get(itrKey);
			System.out.println("key and value:" + itrKey + " " + value);
		}

		Collection<Double> value = nameAndPopulationMap.values();
		Iterator<Double> temp = value.iterator();
		while (temp.hasNext()) {
			Double itrValue = temp.next();
			System.out.println("value:" + itrValue);
		}

	}

}

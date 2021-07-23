package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PersonTester {

	public static void main(String[] args) {

		Map<String, String> nameAndFavourite = new HashMap<String, String>();
		nameAndFavourite.put("Harshitha", "Biriyani");
		nameAndFavourite.put("Dharshan", "Mutton");
		nameAndFavourite.put("Ranjitha", "Bajji");
		nameAndFavourite.put("Sunitha", "Chicken");
		nameAndFavourite.put("Sunil", "Upma");

		System.out.println("total map size:" + nameAndFavourite.size());

		Set<String> key = nameAndFavourite.keySet();
		Iterator<String> itr = key.iterator();
		while (itr.hasNext()) {
			String itrKey = itr.next();
			System.out.println("key:" + itrKey);
			String value = nameAndFavourite.get(itrKey);
			System.out.println("key and value:" + itrKey + " " + value);
		}

		Collection<String> coll = nameAndFavourite.values();
		Iterator<String> temp = coll.iterator();
		while (temp.hasNext()) {
			String itrValue = temp.next();
			System.out.println("value:" + itrValue);
		}
	}

}

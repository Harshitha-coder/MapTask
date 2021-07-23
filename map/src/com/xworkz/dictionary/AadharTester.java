package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AadharTester {

	public static void main(String[] args) {

		Map<Long, Long> aadharNoAndMobileNo = new HashMap<Long, Long>();
		aadharNoAndMobileNo.put(881174202233l, 7899134099l);
		aadharNoAndMobileNo.put(771165740288l, 9876543210l);
		aadharNoAndMobileNo.put(981174298722l, 8865432890l);
		aadharNoAndMobileNo.put(761174254321l, 6345346786l);
		aadharNoAndMobileNo.put(881543420876l, 6360987654l);

		System.out.println("total map size:" + aadharNoAndMobileNo.size());

		Set<Long> set = aadharNoAndMobileNo.keySet();
		Iterator<Long> itr = set.iterator();
		while (itr.hasNext()) {
			Long itrKey = itr.next();
			System.out.println("key:" + itrKey);
			Long value = aadharNoAndMobileNo.get(itrKey);
			System.out.println("key and value:" + itrKey + " " + value);
		}
		Collection<Long> value = aadharNoAndMobileNo.values();
		Iterator<Long> itr1 = value.iterator();
		while (itr1.hasNext()) {
			Long itrValue = itr1.next();
			System.out.println("value:" + itrValue);
		}

	}

}

package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case-insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {

		//CASE_INSENSITIVE_ORDER doesn't work in hashmap, has to do with ordered maps.
		Map<String, String> animalGroupName = new TreeMap<>(String::compareToIgnoreCase);


		animalGroupName.put("Rhino", "Crash");
		animalGroupName.put("Giraffe", "Tower");
		animalGroupName.put("Elephant", "Herd");
		animalGroupName.put("Lion", "Pride");
		animalGroupName.put("Crow", "Murder");
		animalGroupName.put("Pigeon", "Kit");
		animalGroupName.put("Flamingo", "Pat");
		animalGroupName.put("Deer", "Herd");
		animalGroupName.put("Dog", "Pack");
		animalGroupName.put("Crocodile", "Float");


		if (animalName == null) {
			return "unknown";
		}
		animalName = animalName.toLowerCase();
		if (animalGroupName.containsKey(animalName)) {
			return animalGroupName.get(animalName);
		} else {
			return "unknown";
		}
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		Map<String, Double> isItOnSale = new TreeMap<>(String::compareToIgnoreCase);

		isItOnSale.put("KITCHEN4001", 0.20);
		isItOnSale.put("GARAGE1070", 0.15);
		isItOnSale.put("LIVINGROOM", 0.10);
		isItOnSale.put("KITCHEN6073", 0.40);
		isItOnSale.put("BEDROOM3434", 0.60);
		isItOnSale.put("BATH0073", 0.15);

		if (itemNumber == null || (!isItOnSale.containsKey(itemNumber))) {
			return 0.00;
		}
		itemNumber = itemNumber.toUpperCase();

		if (isItOnSale.containsKey(itemNumber)) {
			return isItOnSale.get(itemNumber);
		}
		return isItOnSale.get(itemNumber);
	}


	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {

		int petersMoney = peterPaul.get("Peter");
		int paulsMoney = peterPaul.get("Paul");


		if (paulsMoney < 1000 && petersMoney > 0) {
			int stolenMoney = petersMoney / 2;

			peterPaul.put("Paul", paulsMoney + stolenMoney);
			peterPaul.put("Peter", petersMoney - stolenMoney);
		}

		return peterPaul;
	}


	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		Integer petersMoney = peterPaul.get("Peter");
		Integer paulsMoney = peterPaul.get("Paul");

		if (paulsMoney >= 10000 && petersMoney >= 5000) {

			Integer petersInvestment = (petersMoney / 4);
			Integer paulsInvestment = (paulsMoney / 4);
			peterPaul.put("peterPaulPartnership", paulsInvestment + petersInvestment);

//		peterPaul.put("Paul", paulsInvestment);
//		peterPaul.put("Peter", petersInvestment);
		}
			return peterPaul;
		}




	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> map = new HashMap();
		for (String s:words) {
			map.put(s.charAt(0) + "", s.charAt(s.length() - 1) + "");
		}
		return map;
	}


	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	/*
	Create a Map<String, Integer>
	Loop through all the strings
	Use each string as a key into the map
	The Integer value for each key is the number of times that string has been seen
	2 cases to think about:
	-The first time we see a string (it is not yet in the map)
	-Later times we see a string (it is already in the map)
	 */

	public Map<String, Integer> wordCount(String[] words) {
			Map map = new HashMap();
			for(String s : words)
			{
				if(map.containsKey(s)){
					int v = (int) map.get(s);
					map.put(s, v + 1);
				}
				else
					map.put(s, 1);
			}
			return map;
		}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map map = new HashMap();
		for(int s : ints)
		{
			if(map.containsKey(s)){
				int v = (int) map.get(s);
				map.put(s, v + 1);
			}
			else
				map.put(s, 1);
		}
		return map;
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map map = new HashMap();
		for(String s : words)
		{
			if(!map.containsKey(s))
			{
				map.put(s, false);
			}
			else
			{
				map.put(s, true);
			}
		}
		return map;
	}


	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {
		Map<String, Integer> newMap = new HashMap<>();

		for (String name : mainWarehouse.keySet()){
			if(remoteWarehouse.containsKey(name)){
				newMap.put(name, (mainWarehouse.get(name) + remoteWarehouse.get(name)));
			} else {
				newMap.put(name, mainWarehouse.get(name));
			}
		}
		for (String name : remoteWarehouse.keySet()) {
			if (!(mainWarehouse.containsKey(name))) {
				newMap.put(name, remoteWarehouse.get(name));
			}
		}
		return newMap;
	}
	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		
		{
			Map<String,Integer> result=new HashMap<>();
			int i,j,n,k;
			n=words.length;
			for(i=0;i<n;i++)
			{
				String sub=words[i].substring(words[i].length()-2,words[i].length());
				int count=0;
				for(j=0;j<words[i].length()-2;j++)
				{
					String t=words[i].substring(j,j+2);
					if(t.equals(sub))
						count++;
				}
				result.put(words[i],count);
			}
			return result;
		}
	}

}

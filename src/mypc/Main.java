package mypc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> myMap=new HashMap<>();
		
		myMap.put(2, "two");
		myMap.put(1, "One");
		System.out.println(myMap);
		
		myMap.put(5, "five");
		myMap.put(4, "four");
		System.out.println(myMap);
		
		String result = myMap.get(2);
		
		System.out.println(result);
					
		String rec = myMap.put(5, "FIVE");

		System.out.println(rec);
		
		myMap.remove(1);
		System.out.println(myMap);
		
		Set<Integer> keys = myMap.keySet();
		for (Integer key : keys) {
			System.out.println(key+"  >  " + myMap.get(key));
			
		}

	}

}

package MapsExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
//duplicate entries are not allowed
//duplicate keys are not allowed
//duplicate values are allowed	
//order of insertion is not guaranteed	
	
	public static void main(String[] args) {
		Map<String,String> myMap=new HashMap();
		myMap.put("Maharashtra", "Mumbai");
		myMap.put("Karnataka", "BLR");
		myMap.put("Andrha Pradesh", "Vyzag");
		myMap.put("Maharashtra", "Mumbai");//duplicate entry
		myMap.put(null, "abc");
		myMap.put("xyz", null);
		myMap.put(null, "abc1");
		myMap.put("Karnataka 1", "BLR");
		myMap.put("Karnataka 2", "BLR");		
		
		System.out.println(myMap.get("Karnataka"));
		System.out.println(myMap.get("Maharashtra"));
		
		System.out.println(myMap);
		
		for(Map.Entry mp :myMap.entrySet())
		{
			//System.out.println(mp.getKey());
			//System.out.println(mp.getValue());
			System.out.println(mp);
		}
		
	}

}

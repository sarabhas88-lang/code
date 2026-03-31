package MapsExample;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		Map<String,String> myTable=new Hashtable();
		myTable.put("Maharashtra", "Mumbai");
		myTable.put("Karnataka", "BLR");
		myTable.put("Andrha Pradesh", "Vyzag");
		myTable.put("Maharashtra", "Mumbai");
		myTable.put(null, "abc");
		for(Map.Entry mt:myTable.entrySet())
		{
			System.out.println(mt);
		}
	
	}

}

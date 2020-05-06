// ITC 155 - ASSIGNMENT 4 - COLLECTIONS
// Jessica Sites 
// 5/1/20
//Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if no two keys map
//to the same value(and false if any two  or more keys do map to the same value).For example, if the map contains the following
//key/value pairs, your method would return true:{Marty=Strepp,Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}.But
// calling it on the following map would return false, because of two mappings for Perkins and Reges:{Kendrick=Perkins, 
//Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
import java.util.*;

public class IsUnique {

	public static void main(String[] args) {
		Map<String, String> firstMap = new HashMap<String, String>();
		Map<String, String> secondMap = new HashMap<String, String>();
		
		firstMap.put("Marty", "Stepp");
	    firstMap.put("Stuart", "Reges");
		firstMap.put("Jessica", "Miller");
		firstMap.put("Amanda", "Camp");
		firstMap.put("Hal", "Perkins");
		
		secondMap.put("Kendrick", "Perkins");
		secondMap.put("Stuart", "Reges");
		secondMap.put("Jessica", "Miller");
		secondMap.put("Bruce", "Reges");
		secondMap.put("Hal", "Perkins");
		
		System.out.println(isUnique(firstMap));
		System.out.println(isUnique(secondMap));
	}
	public static boolean isUnique(Map<String, String> map) {
	    HashSet<String> newSet = new HashSet<String>();

	    for(String key : map.keySet()) {
	        String value = map.get(key);

	        if(newSet.contains(value))
	            return false;

	        newSet.add(value);
	    }

	    return true;
	}
}

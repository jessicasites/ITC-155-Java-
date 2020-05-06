import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class jtestisunique {

	@Test
	public void test() {
		
		Map<String, String> firstMap = new HashMap<>();
		firstMap.put("Marty", "Stepp");
	    firstMap.put("Stuart", "Reges");
		firstMap.put("Jessica", "Miller");
		firstMap.put("Amanda", "Camp");
		firstMap.put("Hal", "Perkins");
		
		Map<String, String> secondMap = new HashMap<>();
		secondMap.put("Kendrick", "Perkins");
		secondMap.put("Stuart", "Reges");
		secondMap.put("Jessica", "Miller");
		secondMap.put("Bruce", "Reges");
		secondMap.put("Hal", "Perkins");
		
		assertEquals(true, IsUnique.isUnique(firstMap));
		assertEquals(false, IsUnique.isUnique(secondMap));


		IsUnique.isUnique(firstMap);
		IsUnique.isUnique(secondMap);
	}


	}



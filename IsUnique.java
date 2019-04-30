import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class IsUnique {
	
	public static boolean isUnique(Map<String, String> map) {
		Set<String> values = new HashSet<String>();
		for (String value : map.values()) {
			values.add(value);
		}
		return map.keySet().size() == values.size();
	}
	
	@Test
	void testIsUnique() {
		
		// Simple test of unique map of first name -> last name of textbook authors
		Map<String, String> testMap = new HashMap<String, String>();
		testMap.put("Marty", "Stepp");
		testMap.put("Stuart", "Reges");
		assertTrue(isUnique(testMap));
		testMap.clear();
		
		// Test of non-unique map using two meanings of the word "Paris"
		testMap.put("City of Light", "Paris");
		testMap.put("Homeric adjudicator", "Paris");
		assertFalse(isUnique(testMap));
	}
}

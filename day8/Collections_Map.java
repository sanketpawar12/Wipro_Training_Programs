package day8;

import java.util.HashMap;
import java.util.Map;

public class Collections_Map {
	public static void main(String[] args) {
		
		Map<String, Integer> mapData = new HashMap<String, Integer>();
		mapData.put("A", 45);
		mapData.put("B", 50);
		mapData.put("C", 55);
		mapData.put("D", 66);
		mapData.put("E", 77);
		System.out.println(mapData.keySet());
		System.out.println(mapData.values());
		for(String key: mapData.keySet()) {
			System.out.println(key + "  " + mapData.get(key));
		}
		
	}
}

package gridTraveler;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GridTravelerWithMemoization {

	public static void main(String[] args) {
		System.out.println(numberOfRoute(1, 1));
		System.out.println(numberOfRoute(2, 3));
		System.out.println(numberOfRoute(3, 2));
		System.out.println(numberOfRoute(3, 3));
		System.out.println(numberOfRoute(10, 9));
		System.out.println(numberOfRoute(18, 18));
	}
	
	public static long numberOfRoute(int row, int column, HashMap<String, Long> routeMap) {
		String key = row + "," + column;
//		String key = row > column ? column + "-" + row : row + "-" + column;
		if(routeMap.containsKey(key)) return routeMap.get(key);
		if(row == 1 && column == 1) return 1;
		if(row == 0 || column == 0) return 0;
		routeMap.put(key, numberOfRoute(row - 1, column, routeMap) + numberOfRoute(row, column - 1, routeMap));
		return routeMap.get(key);
	}
	
	public static long numberOfRoute(int row, int column) {
		return numberOfRoute(row, column, new HashMap<>());
	}

}

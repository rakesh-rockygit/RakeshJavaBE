package Hashcode;

import java.util.HashSet;
import java.util.Set;

public class hashSet {

	public static void main(String[] args) {
		Set<String> cities = new HashSet<>();
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("Ankara"); // duplicate - silently ignored

		System.out.println(cities.size());
		System.out.println(cities.contains("Ankara"));
		System.out.println(cities.contains("Bursa"));

		cities.remove("Ankara");
		System.out.println(cities);

		Set<Integer> a = new HashSet<>(Set.of(1, 2, 3, 4));
		Set<Integer> b = new HashSet<>(Set.of(3, 4, 5, 6));
	}
}

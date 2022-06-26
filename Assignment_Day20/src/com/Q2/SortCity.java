package com.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCity {
	public static void main(String[] args) {
		List<City> city = new ArrayList<>();
		city.add(new City("Hyderabad"));
		city.add(new City("Ghaziabad"));
		city.add(new City("Secunderabad"));
		city.add(new City("Ahmedabad"));
		Collections.sort(city,(c1,c2)->c2.getCityName().compareTo(c1.getCityName()));
		for(City C : city) {
			System.out.println(C.getCityName());
		}
	}
}

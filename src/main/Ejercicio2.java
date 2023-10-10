package main;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
	
	public static List<Integer> ejercicio2RecFinal(int a, int b){
		
		List<Integer> res = new ArrayList<>();
		
		if (a < 2 || b < 2) {
			res.add(a*b);
		} else if (a > b) {
			res.add(a);
			res.addAll(ejercicio2RecFinal(a%b, b-1));
		} else {
			res.add(b);
			res.addAll(ejercicio2RecFinal(a-2, b/2));
		}
		
		return res;
			
	}

}

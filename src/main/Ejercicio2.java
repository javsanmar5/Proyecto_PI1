package main;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
	
	private static Boolean esCasoBase(int a, int b) {
		return a < 2 || b < 2;
	}
	
	//RECURSIVO NO FINAL
	public static List<Integer> ejercicio2RecursivoNoF(int a, int b) {
	
		List<Integer> res = new ArrayList<>();
		
		if(esCasoBase(a, b)) {
			res.add(a*b);	
		}else if (a > b) {
			res.add(a);
			res.addAll(ejercicio2RecursivoNoF(a%b, b-1));
		} else {
			res.add(b);
			res.addAll(ejercicio2RecursivoNoF(a-2, b / 2));
		}
		
		return res;
	}
	
	
	//RECURSIVO FINAL
	public static List<Integer> ejercicio2RecursivoF(int a, int b) {
		List<Integer> acum = new ArrayList<>();
		return ejercicio2RecursivoF(a, b, acum);
	}
	
	private static List<Integer> ejercicio2RecursivoF(int a, int b, List<Integer> acum){
		if(esCasoBase(a,b)) {
			acum.add(a*b);
		} else if(a>b) {
			acum.add(a);
			acum = (ejercicio2RecursivoF(a%b, b/2, acum));
		} else {
			acum.add(b);
			acum = (ejercicio2RecursivoF(a-2, b/2, acum));
		}
		return acum;
	}
	
}

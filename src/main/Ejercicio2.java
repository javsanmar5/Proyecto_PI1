	package main;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
	
	private static Boolean esCasoBase(int a, int b) {
		return a < 2 || b < 2;
	}
	
	//RECURSIVO NO FINAL
	public static List<Integer> ejercicio2RecursivoNoF(int a, int b){
		List<Integer> acum = new ArrayList<>();
		
		if( esCasoBase(a, b)) {
			acum.add(0, a*b);
		} else if(a > b) {
			acum.add(0, a);
			acum.addAll(0, ejercicio2RecursivoNoF(a%b, b-1));
		} else {
			acum.add(0, b);
			acum.addAll(0, ejercicio2RecursivoNoF(a -2, b / 2));
		}
		return acum;
	}
		
	//RECURSIVO FINAL
	public static List<Integer> ejercicio2RecursivoF(int a, int b) {
		List<Integer> acum = new ArrayList<>();
		return ejercicio2RecursivoF(a, b, acum);
	}
	
	private static List<Integer> ejercicio2RecursivoF(int a, int b, List<Integer> acum){
		if(esCasoBase(a, b)) {
			acum.add(0, a*b);
		} else if(a>b) {
			acum.add(0, a);
			acum = (ejercicio2RecursivoF(a%b, b/2, acum));
		} else {
			acum.add(0,b);
			acum = (ejercicio2RecursivoF(a-2, b/2, acum));
		}
		return acum;
	}

	
	//ITERATIVO
	public static List<Integer> ejercicio2Iter(int a, int b){
		List<Integer> acum = new ArrayList<>();
		while(!esCasoBase(a, b)){
			if(a > b) {
				acum.add(0, a);
				a = a %b;
				--b;
			} else {
				acum.add(0, b);
				a -= 2;
				b /= 2;
			}
		}
		acum.add(0, a*b);
		return acum;
	}
}

package main;

import java.util.function.UnaryOperator;
import java.util.stream.*;

public class Ejercicio1 {

	public static String ejercicio1 (Integer varA, Integer varB) {
		UnaryOperator<EnteroCadena> nx = elem -> 
		{
			return EnteroCadena.of(elem.a()+3,
				elem.a()%2==0?
				elem.a()+"*":
				elem.a()+"!");
		};
		return Stream
			.iterate(EnteroCadena.of(varA,"A"), elem -> elem.a() < varB, nx)
				.filter(elem -> elem.a()%10 != 0)
				.map(elem -> elem.s()) 
				.collect(Collectors.joining("-")); 
		}
	
	
	public static String ejercicio1Iter (Integer varA, Integer varB) {
		EnteroCadena iter = EnteroCadena.of(varA, "A");
		String res = "";
		while(iter.a() < varB) {
			if(iter.a() % 10 != 0) {
				res += "-" + iter.s();
			}
			iter = EnteroCadena.of(iter.a()+3, iter.a()%2==0 ? iter.a() + "*": iter.a() + "!");
			
		}
		return res.substring(1);
	}
	
	public static String ejercicio1Recur(Integer varA, Integer varB) {
		EnteroCadena iter = EnteroCadena.of(varA, "A");
		String res = "";
		return ejercicio1Recur(iter, varB, res).substring(1);
	}
	
	
	private static String ejercicio1Recur(EnteroCadena iter, Integer varB, String res) {
		if( iter.a() < varB) {
			if(iter.a() % 10 != 0) {
				res += "-" + iter.s();
			}
			res = ejercicio1Recur(EnteroCadena.of(iter.a()+3, iter.a()%2==0 ? iter.a() + "*": iter.a() + "!"), varB, res);
		}
		
		return res;
	}
	
	
	
}

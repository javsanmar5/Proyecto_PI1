	package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
			ejercicio2RecursivoF(a%b, b-1, acum);
		} else {
			acum.add(0,b);
			ejercicio2RecursivoF(a-2, b/2, acum);
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
	
	
	//FUNCIONAL	
	public static record Tupla(List<Integer> l, int a, int b) {
		public static Tupla first(int a, int b) {
			return new Tupla(new ArrayList<Integer>(), a, b);
		}
		
		public Tupla next() {
			if(a > b) {
				l.add(0, a);
				return new Tupla(l, a % b, b-1);
			}else {
				l.add(0, b);
				return new Tupla(l, a - 2, b / 2);
			}
		}
		
		public Boolean esCasoBase() {
			return a < 2 || b < 2;
		}
	}
	
	public static List<Integer> ejercicio2Func(int a, int b){
		Tupla t = Stream.iterate(Tupla.first(a, b), e -> e.next())
				.filter(e -> e.esCasoBase())
				.findFirst().get();
		
		List<Integer> l = t.l();
		l.add(0, t.a() * t.b());
		
		return l;
	}
}

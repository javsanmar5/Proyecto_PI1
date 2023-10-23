package ejercicios;

import java.util.HashMap;
import java.util.Map;

import us.lsi.common.IntPair;

public class Ejercicio4 {

	
	//METODO RECURSIVO SIN MEMORIA
	public static String ejercicio4RecSinMem(int a, int b) {
		
		String res = "";
		
		if(a <= 4) {
			res = Integer.valueOf(a) + "." + Integer.valueOf(b);
		} else if (b <= 4) {
			res = Integer.valueOf(b) + "-" + Integer.valueOf(a);
		} else {
			res = ejercicio4RecSinMem(a / 2, b - 2) + "," 
		+ ejercicio4RecSinMem(a - 2, b / 2) + ","
		+ ejercicio4RecSinMem(a - 1, b - 1);
					
		}
		
		return res;
		
	}
	
	
	//METODO RECURSIVO CON MEMORIA
	public static String ejercicio4RecConMem(int a, int b) {
		return ejercicio4RecConMem(new HashMap<>(), a, b);
	}
	
	private static String ejercicio4RecConMem(Map<IntPair, String> m, int a, int b) {
		String res = "";
		IntPair key = IntPair.of(a, b);
		if(m.containsKey(key)) {
			res = m.get(key);
		} else {
			if(a <= 4) {
				res = Integer.valueOf(a) + "." + Integer.valueOf(b);
			} else if (b <= 4) {
				res = Integer.valueOf(b) + "-" + Integer.valueOf(a);
			} else {
				res = ejercicio4RecConMem(m, a / 2, b - 2) + "," 
			+ ejercicio4RecConMem(m, a - 2, b / 2) + ","
			+ ejercicio4RecConMem(m, a - 1, b - 1);			
			}
			m.put(key, res);
		}
		return res;
	}
	
	
	//METODO ITERATIVO IMPERATIVO
	public static String ejercicio4Iter(int a, int b) {
		String auxiliar = "";
		Map<IntPair, String> m = new HashMap<>();
		for(int i = 0; i <= a ; i++) {
			for(int j = 0; j <= b ; j++) {
				if(i <= 4) {
					auxiliar = Integer.valueOf(i) + "." + Integer.valueOf(j);
				} else if (j <= 4) {
					auxiliar = Integer.valueOf(j) + "-" + Integer.valueOf(i);
				} else {
					auxiliar = m.get(IntPair.of(i / 2, j - 2)) + "," 
							+ m.get(IntPair.of(i - 2, j / 2)) + ","
							+ m.get(IntPair.of(i - 1, j - 1));
				}
				m.put(IntPair.of(i, j), auxiliar);
			}
		}
		return m.get(IntPair.of(a, b));
	}


	
}

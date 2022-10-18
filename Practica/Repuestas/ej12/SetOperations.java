package ejerciciosTP1.ej12;

import java.util.*;

public class SetOperations {

	public static <T> Set<T> union(Set<T> setA, Set<T> setB){
		Set<T> union = new HashSet(setA);
		union.addAll(setB);
		return union;
	}

	public static <T> Set<T> interseccion(Set<T> setA, Set<T> setB){
		Set<T> interseccion = new HashSet(setA);
		interseccion.retainAll(setB);
		return interseccion;
	}

	public static <T> Set<T> diferencia(Set<T> setA, Set<T> setB){
		Set<T> diferencia = new HashSet(setA);
		diferencia.removeAll(setB);
		return diferencia;
	}

	public static <T> Set<T> difSimetrica(Set<T> setA, Set<T> setB){
		Set<T> difSimetrica = new HashSet(setA);
		difSimetrica.addAll(setB);
		difSimetrica.removeAll(interseccion(setA,setB));
		return difSimetrica;
	}
}

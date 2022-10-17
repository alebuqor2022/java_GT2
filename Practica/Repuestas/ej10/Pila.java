package ejerciciosTP1.ej10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pila<T> {
	private List<T> pila = new ArrayList<T>();

	public void push(T o) {
		pila.add(o);
	}
	
	public T pop() {
		T tope = pila.get(pila.size()-1);
		pila.remove(pila.size()-1);
		return tope;
	}
	
	public T peek() {
		T tope = pila.get(pila.size()-1);
		return tope;
	}
	
	public void reverse() {
		Collections.reverse(pila);
	}
	
	public void imprimir() {
		for(T c : pila) {
			System.out.print("[" + c + "]");
		}
		System.out.println("");
	}
}

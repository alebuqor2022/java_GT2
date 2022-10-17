package ejerciciosTP1.ej4;

import java.util.*;

public class Pila {

	private List<Object> pila = new ArrayList<Object>();
//	private int indice = 0;

	public List<Object> getPila() {
		return pila;
	}

	// Eliminar y retornar ultimo elemento
	public Object pop() {
		return pila.remove(pila.size() - 1);
	}

	// agregar a pila
	public void push(Object element) {
		pila.add(element);
	}

	// devovler ultimo elemento
	public Object peek() {
		return pila.get(pila.size() - 1);
	}
	
	//revertir elementos de la lista
	public void reverse() {
		Collections.reverse(pila);
	}

	public void revertir() {
		// voy al ultimo elemento y lo guardo en uno nuevo, pero en el primer lugar
		List temp= new ArrayList();
		for(int i = pila.size(); i>0; i--) {
			temp.add(pila.get(i));
		}
		
	}
	// mostrar elementos
	public void mostrar() {
		Iterator<Object> it = ((List<Object>) pila).iterator();
		int indice = 0;

		while (it.hasNext()) {
			System.out.println(indice + " : " + it.next());
			indice++;
		}

	}

	@Override
	public String toString() {
		return "[Pila=" + pila + "]";
	}

}


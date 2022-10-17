package ejerciciosTP1.ej4;

//import java.util.*;
//import java.util.List;
//import java.util.Scanner;

public class TestPila {

	public static void main(String args[]) {

		test();

	}

	public static void test() {
		Pila p1 = new Pila();
		// agregando elementos
		p1.push("hola");
		p1.push(5);
		p1.push(true);
		p1.push("Java");
		p1.push("chau");
		p1.push(false);

		// mostrando elementos
		System.out.println("----- primer prueba -----");
		p1.mostrar();
		
		//quitando elementos
		System.out.println("----- segunda prueba -----");
		System.out.println("Elemento borrado: "+ p1.pop());
		
		//verifico que el elemento este borrado
		System.out.println("----- tercer prueba -----");
		p1.mostrar();
		
		//obteniendo ultimo elemento sin eliminarlo
		System.out.println("----- cuarta prueba -----");
		System.out.println("Ultimo elemento: " + p1.peek());
		
		// Invertir elementos de la pila
		System.out.println("----- ultima prueba -----");
		System.out.println("Lista con orden invertido: ");
		p1.reverse();
		p1.mostrar();
	}
}


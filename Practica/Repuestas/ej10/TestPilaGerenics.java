package ejerciciosTP1.ej10;

public class TestPilaGerenics {
	static Pila pila = new Pila();
	
	public static void main(String[] args) {
		System.out.println("Agrego 6 elementos con push:");
		testPush();
		System.out.println("Elimino 2 elementos con pop:");
		testPop();
		System.out.println("Devuelve el tope:");
		testPeek();
		System.out.println("Invierte todos los elementos:");
		testReverse();
	}
	
	public static void testPush() {
		pila.push(5);
		pila.push("Hola");
		pila.push(7.4);
		pila.push(true);
		pila.push(false);
		pila.push(25);
		pila.imprimir();
		System.out.println("--------------------");
	}
	
	public static void testPop() {
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		pila.imprimir();
		System.out.println("--------------------");
	}
	
	public static void testPeek() {
		System.out.println(pila.peek());
		System.out.println("--------------------");
	}
	
	public static void testReverse() {
		pila.reverse();
		pila.imprimir();
	}	
	
}

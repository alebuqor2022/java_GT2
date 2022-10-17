package clase4_generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestGenerics {

	public static void main(String[] args) {
		ejemplo0();
		ejemplo1();
		ejemplo3();
		ejemplo4();
		
	}
	public static void ejemplo0() {
		ArrayList lista1=new ArrayList();
		List lista=new ArrayList(); // List es interface
				
		lista.add("uno");
		lista.add("segundo");
		lista.add(4);
		
	    System.out.println(lista);
		
		Iterator it=lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(" " + it.next());
		}
	}
	public static void ejemplo1() {
		// un ARRAY es la definicion con [ ], heredo comportamiento de OBJECT
		// reserva el espacio en memoria (2bytes= 16 bits) para guardar los datos del vector
		// lo hace en el momento de la declaracion
		String[] miVector=new String[2];
		
		
		// lo hace en el momento de la carga de datos, 
		// lo hace diferido la reserva de la memoria
		// no permite elementos de distintos tipos
		String miVector1[]=new String[2];
		
		miVector[0]="Ana";
		miVector[1]="Pepe";
		
		miVector1[0]="Susy";
		miVector1[1]="Jose";
		
		for( String valor: miVector) {
		System.out.println(valor);
		}
		for( String valor: miVector1) {
			System.out.println(valor);
		}
	}

	public static void ejemplo2() {
		// todos sus elementos son del mismo tipo
		ArrayList<String> files = new ArrayList<String>();
		
		files.add("miarchivo1");
		files.add("otroArchivo"); 
		
		HashSet<Integer> miHash=new HashSet<Integer>();
		
		miHash.add(4);
		miHash.add(5);

	}

	public static void ejemplo3() {
		Pair<String> aPair = new Pair<String>();
		aPair.setFirst("hola");
		String first = aPair.getFirst();
		System.out.println(first);

	}
	public static void ejemplo4() {
	Par<Integer, String> p = new Par<>(5,"Cinco");  
	System.out.println("La key es :" + p.getKey());  
	System.out.println("El value de Par es :" + p.getValue());  
	
	 Integer[ ] arr1 = {20, 30, 40, 50, 60, 70, 80};	
     System.out.println("Leyendo nros: ");
     Par.display(arr1);
     System.out.println(Par.mostrar(arr1));
     System.out.println("--------------------------");
     System.out.println(mostrar2(arr1));
	} 
	
	public static <T> T mostrar2(T[] a) {
		return a[a.length / 2];

	}
}



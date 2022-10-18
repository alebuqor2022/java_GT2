package ejerciciosTP1.ej12;

import java.util.HashSet;
import java.util.Set;

public class TestSetOperations {
	static SetOperations test = new SetOperations();
	static Set setA = new HashSet();
	static Set setB = new HashSet();

	public static void main(String[] args) {
		testAgregarASets();
		testUnion();
		testInterseccion();
		testDiferencia();
		testDifSimetrica();
	}
	
	public static void testAgregarASets() {
		System.out.print("setA contiene:");
		setA.add(47);
		setA.add("hola");
		setA.add(22.5);
		System.out.println(setA);
		System.out.print("setB contiene:");
		setB.add(30);
		setB.add("adios");
		setB.add(22.5);
		System.out.println(setB);
		System.out.println("------------------------------");
	}
	
	public static void testUnion() {
		System.out.println("La union es: ");
		System.out.println(test.union(setA, setB));
		System.out.println("------------------------------");
	}
	
	public static void testInterseccion() {
		System.out.println("La interseccion es:");
		System.out.println(test.interseccion(setA, setB));
		System.out.println("------------------------------");
	}
	
	public static void testDiferencia() {
		System.out.print("La diferencia setA-setB es: ");
		System.out.println(test.diferencia(setA, setB));
		System.out.print("La diferencia setB-setA es: ");
		System.out.println(test.diferencia(setB, setA));
		System.out.println("------------------------------");
	}
	
	public static void testDifSimetrica() {
		System.out.println("La diferencia simetrica es:");
		System.out.println(test.difSimetrica(setA, setB));
	}
}

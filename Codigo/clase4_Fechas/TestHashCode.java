package clase4_Fechas;

public class TestHashCode {

	public static void main(String[] args) {
		// sin hacer override de hashCode y de equals
		Persona p= new Persona();	
		p.setNombre("Ana");
		System.out.println(p.hashCode()); // devuelve 1791741888
		
		Persona p1= new Persona();		
		p1.setNombre("Ana");
		System.out.println(p1.hashCode()); // devuelve 1595428806
		
		System.out.println(p.equals(p1));
		
		// haciendo override devuelve
		// 66003
		// 66003
		// true

	}

}

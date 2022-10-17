package ejerciciosTP1.ej10;

public class testPlanetas {

	public static void main(String[] args) {
		testMasaRadio(Planetas.MERCURIO);
		System.out.println("-------------------------------");
		testMasaRadio(Planetas.TIERRA);
		System.out.println("-------------------------------");
		testMasaRadio(Planetas.MARTE);
	}
	
	public static void testMasaRadio(Planetas planeta) {
		switch(planeta) {
		case MERCURIO: 
			imprimirDatos(planeta.MERCURIO);
			break;
		case VENUS: 
			imprimirDatos(planeta.VENUS);
			break;
		case TIERRA: 
			imprimirDatos(planeta.TIERRA);
			break;
		case MARTE: 
			imprimirDatos(planeta.MARTE);
			break;
		case JUPITER: 
			imprimirDatos(planeta.JUPITER);
			break;
		case SATURNO: 
			imprimirDatos(planeta.SATURNO);
			break;
		case URANO: 
			imprimirDatos(planeta.URANO);
			break;
		case NEPTUNO: 
			imprimirDatos(planeta.NEPTUNO);
			break;
		}
	}
	
	private static void imprimirDatos(Planetas planeta) {
		System.out.println("La masa de " + planeta +" es de: " + planeta.getMasa() + ", y su radio de: " + planeta.getRadio());
	}
}

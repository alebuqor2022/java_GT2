package clase4_Fechas;

import java.util.Objects;

public class Persona {
String nombre;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int hashCode() {
	return Objects.hash(nombre);
}

public boolean equals(Object obj) {
// comparo usando el equals del atributo nombre
	
//	Persona p=(Persona)obj;
//	return Objects.equals(nombre, p.nombre);

// comparo usando el int que devuelve el hascode overrideado
	if (obj.hashCode() == this.hashCode()) {
		return true;
	}
	return false;
}

}
 
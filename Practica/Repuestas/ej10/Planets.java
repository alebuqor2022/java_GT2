package ejerciciosTP1.ej10;

public abstract class Planets {
double radio;
double masa;

public Planets(double radio, double masa) {
	super();
	this.radio = radio;
	this.masa = masa;
}
public double getRadio() {
	return radio;
}
public void setRadio(double radio) {
	this.radio = radio;
}
public double getMasa() {
	return masa;
}
public void setMasa(double masa) {
	this.masa = masa;
}




}

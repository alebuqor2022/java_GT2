package clase4_generics;

public class Pair<Tipo> {
	private Tipo first;
	private Tipo second;
	
	public Pair() {
		first = null;
		second = null;
	}
	public Pair(Tipo first, Tipo second) {
		this.first = first;
		this.second = second;
	}
	public Tipo getFirst() {
		return first;
	}
	public Tipo getSecond() {
		return second;
	}
	public void setFirst(Tipo newValue) {
		first = newValue;
	}
	public void setSecond(Tipo newValue) {
		second = newValue;
	}

}

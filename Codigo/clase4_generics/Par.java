package clase4_generics;

public class Par<K, V> {
K key;
V value;


public Par(K key, V value) {
	super();
	this.key = key;
	this.value = value;
}
public K getKey() {
	return key;
}
public void setKey(K key) {
	this.key = key;
}
public V getValue() {
	return value;
}
public void setValue(V value) {
	this.value = value;
}

public static <K> void display(K[] array)
{
// Now, we will use for each loop and reads elements of array.
	 for(K k : array) {
	  System.out.print(k+ " ");	 
	 }
 System.out.println();	 
}

public static <T> T mostrar(T[] a) {
	return a[a.length / 2];

}

}

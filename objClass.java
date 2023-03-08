package genericsDemo;

public class objClass<T> {

	private T obj;
	
	public void addObj(T obj) {
		this.obj=obj;
	}
	
	public T get() {
		return obj;
	}
	
	public static <T> T getFirst(T[] t){
		if(t == null || t.length == 0) {
			return null;
		}
		else return t[0];
	}
}

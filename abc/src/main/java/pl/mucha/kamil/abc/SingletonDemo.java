package pl.mucha.kamil.abc;


public class SingletonDemo {
	public static void main(String[] args) {

		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s + " " + s2);
		System.out.println(Integer.MAX_VALUE);
	}
}

package singleton;

public class Singleton {
	
	private static Singleton instancia;
	
	private Singleton () {}
	
	public static Singleton getInstance() {
		if (instancia == null) {
			instancia = new Singleton();
			System.out.println("Criei um novo");
		} else {
			System.out.println("Usei o antigo");
		}
		
		return instancia;
	}

}

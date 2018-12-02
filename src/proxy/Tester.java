package proxy;

public class Tester {

	public static void main(String[] args) {
		
		CalculoImexivel ci = new CalculoImexivel();
		
		ProxyCalculoImexivel pci = new ProxyCalculoImexivel(ci);
		
		pci.calcular(23);

	}

}

package Visitor_2_professor;


public class Tester {

	public static void main(String[] args) {
		Mercadoria[] mercadorias = new Mercadoria[] { new Quadrinho(35, "001"),
				new Quadrinho(44, "035"), new FiguraDeEscala(355, 2, "Sakura"),
				new FiguraDeEscala(250, 1, "Ryu")};
		
		int total = calcularPreco(mercadorias);
		System.out.println("Total da compra = " + total);
	}
	
	private static int calcularPreco(Mercadoria[] mercadorias) {
		CarrinhoDeComprasVisitor visitar = new CarrinhoDeComprasVisitorImpl();
		int sum = 0;
		for (Mercadoria mercadoria : mercadorias) {
			sum = sum + mercadoria.aceitar(visitar);
		}
		return sum;
	}

}

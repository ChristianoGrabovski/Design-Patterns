package Visitor_2_professor;

public class Quadrinho implements Mercadoria{

	private int preco;
	private String edicao;
	
	
	public Quadrinho(int custo, String numero) {
		super();
		this.preco = custo;
		this.edicao = numero;
	}
	
	public int getPreco() {
		return preco;
	}
	
	public String getEdicao() {
		return edicao;
	}


	@Override
	public int aceitar(CarrinhoDeComprasVisitor visitor) {
		return visitor.visitar(this);
	}
	
	

}

package Visitor_2_professor;

public class FiguraDeEscala implements Mercadoria{
	
	private int precoPorPeca;
	private int quantidade;
	private String nome;
	
	public FiguraDeEscala(int precoPeca, int quant, String nm) {
		this.precoPorPeca = precoPeca;
		this.quantidade = quant;
		this.nome = nm;		
	}

	public int getPrecoPorPeca() {
		return precoPorPeca;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public int aceitar(CarrinhoDeComprasVisitor visitor) {
		return visitor.visitar(this);
	}
	
	
	
	
	

}

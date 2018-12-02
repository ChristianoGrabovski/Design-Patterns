package Visitor_2_professor;

public class CarrinhoDeComprasVisitorImpl implements CarrinhoDeComprasVisitor{
	
	@Override
	public int visitar(Quadrinho quadrinho) {
		int custo=0;
		if(quadrinho.getPreco() > 50) {
			custo = quadrinho.getPreco()-5;
		}else custo = quadrinho.getPreco();
		System.out.println("Quadrinho Edição::"+quadrinho.getEdicao()+"custo ="+custo);
		return custo;
	}

	@Override
	public int visitar(FiguraDeEscala figuraDeEscala) {
		int custo = figuraDeEscala.getPrecoPorPeca()*figuraDeEscala.getQuantidade();
		System.out.println(figuraDeEscala.getNome() + " cost = "+custo);
		return custo;
	}

}

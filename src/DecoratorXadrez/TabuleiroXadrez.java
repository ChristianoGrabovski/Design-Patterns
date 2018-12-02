package DecoratorXadrez;

public abstract class TabuleiroXadrez {
	
	protected String descricao;

	
	public String getDescricao() {
		return this.descricao;
	}
	
	public abstract int OcuparCasa();

}

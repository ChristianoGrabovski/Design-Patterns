package Tabuleiro.pecas;

import DecoratorXadrez.PecasTabuleiro;
import DecoratorXadrez.TabuleiroXadrez;

public class Torre extends PecasTabuleiro {
	private TabuleiroXadrez tabuleiroXadrez;

	public Torre(TabuleiroXadrez tabuleiroXadrez) {
		this.tabuleiroXadrez = tabuleiroXadrez;
	}

	@Override
		public String getDescricao() {
			return tabuleiroXadrez.getDescricao()+"uma Torre ";
	}

	@Override
	public int OcuparCasa() {
		return tabuleiroXadrez.OcuparCasa() -1;
	}
}

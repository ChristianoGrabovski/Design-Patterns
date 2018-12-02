package Tabuleiro.pecas;

import DecoratorXadrez.PecasTabuleiro;
import DecoratorXadrez.TabuleiroXadrez;

public class Dama extends PecasTabuleiro {
	private TabuleiroXadrez tabuleiroXadrez;

	public Dama(TabuleiroXadrez tabuleiroXadrez) {
		this.tabuleiroXadrez = tabuleiroXadrez;
	}

	@Override
		public String getDescricao() {
			return tabuleiroXadrez.getDescricao()+"uma Dama ";
	}

	@Override
	public int OcuparCasa() {
		return tabuleiroXadrez.OcuparCasa() -1;
	}
}

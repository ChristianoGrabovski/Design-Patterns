package Tabuleiro.pecas;

import DecoratorXadrez.PecasTabuleiro;
import DecoratorXadrez.TabuleiroXadrez;

public class Rei extends PecasTabuleiro {
	private TabuleiroXadrez tabuleiroXadrez;

	public Rei(TabuleiroXadrez tabuleiroXadrez) {
		this.tabuleiroXadrez = tabuleiroXadrez;
	}

	@Override
		public String getDescricao() {
			return tabuleiroXadrez.getDescricao()+"um Rei ";
	}

	@Override
	public int OcuparCasa() {
		return tabuleiroXadrez.OcuparCasa() -1;
	}
}

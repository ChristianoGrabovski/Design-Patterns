package Tabuleiro.pecas;

import DecoratorXadrez.PecasTabuleiro;
import DecoratorXadrez.TabuleiroXadrez;

public class Bispo extends PecasTabuleiro {
	private TabuleiroXadrez tabuleiroXadrez;

	public Bispo(TabuleiroXadrez tabuleiroXadrez) {
		this.tabuleiroXadrez = tabuleiroXadrez;
	}

	@Override
		public String getDescricao() {
			return tabuleiroXadrez.getDescricao()+"um Bispo ";
	}

	@Override
	public int OcuparCasa() {
		return tabuleiroXadrez.OcuparCasa()-1;
	}
}

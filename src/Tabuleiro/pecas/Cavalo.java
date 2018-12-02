package Tabuleiro.pecas;

import DecoratorXadrez.PecasTabuleiro;
import DecoratorXadrez.TabuleiroXadrez;

public class Cavalo extends PecasTabuleiro {
	private TabuleiroXadrez tabuleiroXadrez;

	public Cavalo(TabuleiroXadrez tabuleiroXadrez) {
		this.tabuleiroXadrez = tabuleiroXadrez;
	}

	@Override
		public String getDescricao() {
			return tabuleiroXadrez.getDescricao()+"um Cavalo ";
	}

	@Override
	public int OcuparCasa() {
		return tabuleiroXadrez.OcuparCasa() -1;
	}
}

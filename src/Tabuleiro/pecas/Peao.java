package Tabuleiro.pecas;

import DecoratorXadrez.PecasTabuleiro;
import DecoratorXadrez.TabuleiroXadrez;

public class Peao extends PecasTabuleiro {
	private TabuleiroXadrez tabuleiroXadrez;

	public Peao(TabuleiroXadrez tabuleiroXadrez) {
		this.tabuleiroXadrez = tabuleiroXadrez;
	}

	@Override
		public String getDescricao() {
			return tabuleiroXadrez.getDescricao()+"um Peao ";
	}

	@Override
	public int OcuparCasa() {
		return tabuleiroXadrez.OcuparCasa()-1;
	}
}

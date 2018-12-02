package DecoratorXadrez;

import Decorator.Tabuleiro.TabuleiroMadeira;
import Tabuleiro.pecas.Bispo;
import Tabuleiro.pecas.Cavalo;
import Tabuleiro.pecas.Dama;
import Tabuleiro.pecas.Peao;
import Tabuleiro.pecas.Rei;
import Tabuleiro.pecas.Torre;

public class Tester {

	public static void main(String[] args) {
		TabuleiroXadrez tm1 = new TabuleiroMadeira();

		tm1 = new Rei(tm1);
		tm1 = new Dama(tm1);
		tm1 = new Bispo(tm1);
		tm1 = new Cavalo(tm1);
		tm1 = new Torre(tm1);
		tm1 = new Peao(tm1);
		
		
		System.out.println(tm1.getDescricao());
		System.out.println("Restam " + tm1.OcuparCasa() + " Casas no tabuleiro!");
		

}
}
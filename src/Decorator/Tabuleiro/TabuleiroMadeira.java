package Decorator.Tabuleiro;

import DecoratorXadrez.TabuleiroXadrez;

public class TabuleiroMadeira extends TabuleiroXadrez{

public  TabuleiroMadeira(){
	descricao = "Tabuleiro feito de Madeira de carvalho com ";

}


@Override
public int OcuparCasa() {
	return 64;
			
}
}
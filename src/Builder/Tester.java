package Builder;

public class Tester {

	public static void main(String[] args) {
		
		Heroi hr = new Heroi("Chosen Undead","Guerreiro");
		
		HeroiBuilder heroi = new HeroiBuilder(hr);
		
		heroi.caracteristicas("Aamaldiçoado")
		.caracteristicas ("Caorajoso")
		.arma("Espada Flamejante")
		.armaSecundaria("Escudo de Crista de Dragão");
				
				System.out.println(heroi.getHeroi());
		
		
		


	}

}

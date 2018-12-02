package Builder;

public class Tester {

	public static void main(String[] args) {
		
		Heroi hr = new Heroi("Chosen Undead","Guerreiro");
		
		HeroiBuilder heroi = new HeroiBuilder(hr);
		
		heroi.caracteristicas("Aamaldi�oado")
		.caracteristicas ("Caorajoso")
		.arma("Espada Flamejante")
		.armaSecundaria("Escudo de Crista de Drag�o");
				
				System.out.println(heroi.getHeroi());
		
		
		


	}

}

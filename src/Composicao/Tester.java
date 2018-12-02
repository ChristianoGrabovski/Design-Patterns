package Composicao;

public class Tester {

	public static void main(String[] args) {
		
		Guerreiro s1 = new Guerreiro("Musashi","Japao","Katana");
		
		Samurai samurai = new Samurai();
		samurai.setIdSamurai(1);
		samurai.setGuerreiro(s1);
		
		
		System.out.println(samurai.getGuerreiro().getNome());
		System.out.println(samurai.getGuerreiro().getArma());
		
	Guerreiro c1 = new Guerreiro("Edylsion","Roma","Espada Curta");
		
		Centuriao centuriao = new Centuriao();
		centuriao.setIdCenturiao(2);
		centuriao.setGuerreiro(c1);
		
		System.out.println(centuriao.getGuerreiro().getNome());
		System.out.println(centuriao.getGuerreiro().getArma());
		
		
		
		
		
		
		

	}

}

package AbstractFactory;

public class Tester {
	public static void main(String[] args) {
		Ferreiro es = new Ferreiro();
		Espada espada = null;
		
		//criando uma espada longa com elemento de fogo
		
		espada = es.criarEspada(TipoEspada.Espada_de_Ifrit, new EspadaDeIfrit());
		System.out.println(espada);
		
		//criando uma katana com elemento divino
	
		espada = es.criarEspada(TipoEspada.Katana_Divina, new KatanaDivina());
		System.out.println(espada);


	}

}

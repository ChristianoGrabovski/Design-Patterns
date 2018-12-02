package AbstractFactory;

public class Ferreiro {
	
	public Espada criarEspada(TipoEspada tipoEspada, EspadaFactory forja){
		Espada espada = null;
		
		switch(tipoEspada){
		case Katana_Divina:
			espada = new EncantoSagrado(forja);
			
			break;
		case Espada_de_Ifrit:
			espada = new EncantoFlamejante(forja);
			break;
		}
		espada.setNome(tipoEspada.toString());
		espada.refinar();
		return espada;
		
	}


}

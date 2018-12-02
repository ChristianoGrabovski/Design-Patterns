package AbstractFactory;


public class EncantoFlamejante extends Espada{
	
	public EncantoFlamejante(EspadaFactory espadaFactory) {
		super(espadaFactory);

	}

	@Override
	public void forjar() {
		tipo = espadaFactory.criarTipo();
		metal = espadaFactory.criarMetal();
	}
}

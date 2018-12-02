package AbstractFactory;

public class EncantoSagrado extends Espada{
	
	public EncantoSagrado(EspadaFactory espadaFactory) {
		super(espadaFactory);

	}

	@Override
	public void forjar() {
		tipo = espadaFactory.criarTipo();
		metal = espadaFactory.criarMetal();
	}
}

package AbstractFactory;

public class EspadaDeIfrit extends EspadaFactory{
	
	@Override
	public Tipo criarTipo() {
		return new EspadaLonga();
	}

	@Override
	public Metal criarMetal() {
		return new Aço();
	}


}

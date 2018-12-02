package AbstractFactory;

public class KatanaDivina extends EspadaFactory {
	
	@Override
	public Tipo criarTipo() {
		return new Katana();
	}

	@Override
	public Metal criarMetal() {
		return new Prata();
	}

}

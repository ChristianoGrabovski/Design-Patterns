package Fabrica;

public class ConselhoDoReino {
	
	private HierarquiaFactory hierarquiaFactory;

	public ConselhoDoReino(HierarquiaFactory hf) {
		hierarquiaFactory = hf;
	}
	
	public Hierarquia nomear(String tipo) {
		
		return hierarquiaFactory.nomearNobre(tipo);
		
		
	}

	
}

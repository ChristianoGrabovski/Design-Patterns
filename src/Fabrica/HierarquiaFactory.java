package Fabrica;

public class HierarquiaFactory {
	
	public Hierarquia nomearNobre(String tipo) {
		Hierarquia hierarquia = null;
		if(tipo.equals("Lorde"))
			hierarquia = new Lorde();
		else if (tipo.equals("Principe"))
			hierarquia = new Principe();
		else if (tipo.equals("Rei"))
			hierarquia = new Rei();
		return hierarquia;
	}

}

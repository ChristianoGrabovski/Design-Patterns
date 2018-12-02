package AbstractFactory;

public abstract class Espada {
	
	EspadaFactory espadaFactory;
	
	public Espada(EspadaFactory espadaFactory) {
		this.espadaFactory = espadaFactory;
	}
	
	protected String nome;
	protected Metal metal;
	protected Tipo tipo;
	
	public void refinar() {
		forjar();//metodo fabrica
		this.afiar();
		this.encantar();
		this.guardar();
	}
	
	public abstract void forjar();
	
	public void afiar() {
		System.out.println("Afiando Espada");
	}
	
	public void encantar(){
		System.out.println("Encatando Espada");
	}
	
	public void guardar(){
		System.out.println("Guardando Espada");
	}
	
	
	@Override
	public String toString() {
		return "Espada [nome=" + nome + ", metal=" + metal.getDescricao() + ", tipo=" + tipo.getDescricao() + "]";
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	
	
	
	
	
	

}

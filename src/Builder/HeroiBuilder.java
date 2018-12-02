package Builder;

import java.io.File;

public class HeroiBuilder {
	private Heroi heroi;
	
	public Heroi getHeroi() {
		return heroi;
	}

	public HeroiBuilder(Heroi heroi) {
		this.heroi=heroi;
		
	}
	
	public HeroiBuilder caracteristicas(String c) {
		heroi.getCaracteristicas().add(c);
		return this;
		
	}
		
		public HeroiBuilder habilidade(File h) {
			heroi.getHabildiades().add(h);
			return this;
	}
		
		public HeroiBuilder arma(String a) {
			heroi.setArma(a);
			return this;
		}
		
		public HeroiBuilder armaSecundaria(String as) {
			heroi.setArmaSecundaria(as);
			return this;
		}
	
};

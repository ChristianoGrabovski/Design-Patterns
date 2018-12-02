package Builder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Heroi {
	
	private String nome;
	private List<String> caracteristicas;
	private String arma;
	private String armaSecundaria;
	private List<File> habilidades;

	public Heroi(String nome, String caracteristica) {
		this.nome = nome;
		caracteristicas = new ArrayList<String>();
		caracteristicas.add(caracteristica);
	}
	
	public void addCaracteristicas(String c) {
		caracteristicas.add(c);
	}
	
	public void addHabilidade(File h) {
		if (habilidades==null)
			habilidades=new ArrayList();
		habilidades.add(h);
	}
	
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	public String getArmaSecundaria() {
		return armaSecundaria;
	}
	public void setArmaSecundaria(String armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}
	public List<File> getHabildiades() {
		return habilidades;
	}
	public void setHabilidades(List<File> habilidades) {
		this.habilidades = habilidades;
	}
	public String getRemetente() {
		return nome;
	}
	public List<String> getCaracteristicas() {
		return caracteristicas;
	}

	@Override
	public String toString() {
		return "Heroi [nome=" + nome + ", caracteristicas=" + caracteristicas + ", arma=" + arma + ", armaSecundaria="
				+ armaSecundaria + ", habilidades=" + habilidades + "]";
	}

	
	
}

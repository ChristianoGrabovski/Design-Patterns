package Strategy;

//o Padr�o strategy define uma fam�lia de algoritmos, encapsula cada um deles e os torna intercamb�veis.
//O strategy deixa o algoritmos variar independente dos clientes que o ultilizam

//ou seja, vc tem alguns dados e baseado nesses dados vc tem que tomar alguma deecisis�o 

public interface Frete {
	
	public double calcularPreco(int distancia);
}
	

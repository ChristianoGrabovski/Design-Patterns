package Strategy;

//o Padrão strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambíveis.
//O strategy deixa o algoritmos variar independente dos clientes que o ultilizam

//ou seja, vc tem alguns dados e baseado nesses dados vc tem que tomar alguma deecisisão 

public interface Frete {
	
	public double calcularPreco(int distancia);
}
	

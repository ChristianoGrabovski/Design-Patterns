package Strategy;

//EXISTE UMA FABRICA DE OBJETOS PARA CADA TIPO DO ENUM

//se eu crio um metodo abstrato dentro de um enum, cada enum precisa implementar esse metodo

public enum TipoFrete {
	
	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Normal();
		}
	},
	
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	};
	
	
	public abstract Frete obterFrete();
	

}

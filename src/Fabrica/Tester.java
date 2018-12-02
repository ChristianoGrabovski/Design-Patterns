package Fabrica;

public class Tester {

	public static void main(String[] args) {
		
		ConselhoDoReino conselho = new ConselhoDoReino(new HierarquiaFactory());
		Hierarquia nobre = conselho.nomear("Lorde");
		
		System.out.println(nobre.getHierarquia());
		
		//não entendi a parte de baixo
		
		int[][] matriz = new int[2][3];
		int[][] transposta = new int[3][2];
		
		matriz[0][0]=0;
		matriz[0][1] = 1;
		matriz[0][2] = 2;
		
		matriz[1][0]=3;
		matriz[1][1] = 4;
		matriz[1][2] = 5;
		
		
		
		for(int i=0; i< 2;i++){
			for(int j=0;j<3;j++){
				System.out.print(matriz[i][j]+" ");
				transposta[j][i]=matriz[i][j];
			}
			System.out.println();
		}
		
		for(int i=0; i<3;i++){
			for(int j = 0; j<2  ;j++){
				
				System.out.print(transposta[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	}

}

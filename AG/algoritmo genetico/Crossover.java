
public class Crossover {

	public Crossover() {
		// TODO Auto-generated constructor stub
	}
	
	public Individuo[] cruzar(Individuo i1, Individuo i2) {
		Individuo[] filhos = new Individuo[2];
		filhos[0] = new Individuo();
		filhos[1] = new Individuo();
		
		//cada filhos recebe metade dos genes dos pais
		int pontoDeCorte = i1.genes.length/2;
		//genes que serão armazenados no 1º e 2º filho
		int[] fgenes1 = new int[i1.genes.length];
		int[] fgenes2 = new int[i2.genes.length];
		//o for será executado 64 vezes
		for(int i=0; i<fgenes2.length;i++) {
			//enquanto for menor que o ponto de corte
			if( i<pontoDeCorte) {
	  //o gene do filho1 recebe o inicio do gene do progenitor 1
				fgenes1[i] = i2.genes[i];
				fgenes2[i] = i2.genes[i];
	//o filho1 começa a receber o final do progenitor 2
			}else {
				fgenes1[i] = i2.genes[i];
				fgenes2[i] = i1.genes[i];
			}
		}//for
		//passar os filhos gerados para o array Filhos
		filhos[0].genes = fgenes1; 
	    filhos[1].genes = fgenes2;
	    
	    return filhos;
	}//funcao cruzar

}//class Crossover

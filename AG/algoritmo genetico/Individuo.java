
import java.util.Random;
import java.util.Arrays;
public class Individuo implements Comparable<Individuo>{
	
    int[] genes = new int[64];
	int aptidao = 0;
    
	 /**
     * Gera um individúo Aleatório
     * @param numGenes
     */
	public Individuo() {
		//conjunto de genes= cromossomo
		Random rn = new Random();
	  //Cada posicao esta sorteando um valor entre 0 e 1
        for (int i = 0; i < genes.length; i++) {
            genes[i] = Math.abs(rn.nextInt() % 2);
        }
        //aptidao = 0;
    }
	/**METODO QUE GERA A APTIDÃO BASEADA NA SEQUENCIA DE APENAS 3 1S**/
	public int getAptidao() {
		//retirar os genes
		 int conta = 0;
		  aptidao = 0;
	        for (int i = 0; i < genes.length; i++) {
	            if (genes[i] == 1) {
	            	conta+=1;
	            }else {
	            	if(conta==3) {
	            		aptidao+=1;
	            		conta=0;
	            	}
	            	conta=0;
	            }    
	     }//for 
	      return aptidao;
	}
	
	/**METODO QUE ORGANIZA A POPULAÇÃO COM BASE NA APTIDÃO**/
	public int compareTo(Individuo o) {
		//pior aptidao
		if(this.getAptidao()< o.getAptidao()) {
			return -1;
		}else if (this.getAptidao()== o.getAptidao()) {
			return 0;
			//melhor aptidão
		}else {
			return 1;
		}
	}
	
}//Individuo

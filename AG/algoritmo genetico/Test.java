import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
/**Neste algoritmo ser� mostrado apenas o melhor indiv�duo**/
public class Test {
	/*Com uma popula��o inicial de 2 e 7 gera��es, 
	 * e acrescentado 2 individuos em cada gera��o, 
	 * n�o se ultrapassa o valor de 16 individuos*/
	static int geracoes = 7;
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	    Mutacao m = new Mutacao();
		Populacao p = new Populacao();
		Crossover c = new Crossover();   
		//apos realiza a muta�ao repete-se este processo ate alcan�ar a 10 gera��o
		for(int y=0; y<geracoes;y++ ) {
			//seleciona 2 individuos
			Individuo[] i = p.selecao();
			//cruzar os 2
			i = c.cruzar(i[0], i[1]);
			//adiciona os indivi gerados na populacao(pop + 2)
			p.pop.add(i[0]);
			p.pop.add(i[1]);
			//apos adicionar realiza a mutacao
			m.RealizaMutacao(p.pop);
			System.out.println("Gera��o:"+y);
			for(Individuo in : p.pop){
				System.out.println(Arrays.toString(in.genes));
				System.out.println("Aptid�o:"+in.getAptidao());
			}
			System.out.println();
		}
		//Organizar a popula��o do melhor para o pior
		Collections.sort(p.pop);
		Individuo melhor = p.pop.getLast();
		//mostrar o genes do melhor individuo que encontrou e sua aptidao
		System.out.println("***********Melhor*************");
		System.out.println("Individuo mais apto "+Arrays.toString(melhor.genes) + "\nAptidao: "+ melhor.getAptidao());
		
	}//main

}// Test

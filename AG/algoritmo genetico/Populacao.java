
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
public class Populacao {
	
	int popInicial = 2;
    //populaçao é um conjunto de individuos
	 LinkedList<Individuo> pop =new LinkedList<>(); 
	 Individuo in = new Individuo();
	/**1.Inicializa população*/
	 
	 public Populacao() {
		for(int i=0; i<popInicial;i++ ) {
			pop.add(new Individuo());
		}
	 }
	  
	/***2.Seleçiona 2 individuos da população baseados nas chances dos 
	  individuos */
	 public Individuo[] selecao() {
		 Collections.sort(pop);
		 //array com apenas com os 2 individuos selecionados
		 Individuo[] selecionados = new Individuo[2];
		 //array de chances e cada individuo de ser escolhido
		 double[] chances = new double[pop.size()];
		 //soma de todos os fitness
		 int totalAptidao =0;
		 for(Individuo individuo : pop) {
			 totalAptidao += individuo.getAptidao();
		 }
		 //variavel que acumula a porcentagem confirme se vai do pior para o melhor
		 double acc =0;
		 //este for vai durar durante todo o tamanho da população
		 for(int i=0; i<pop.size();i++ ) {
			 Individuo individuo = pop.get(i);
			 //valor total da aptidao em porcentagem acumulada
			 acc += (individuo.getAptidao() * 100/totalAptidao);
			 chances[i] = acc;
		}//for
		 int indice =0;
		 while(selecionados[0] == null || selecionados[1]==null) {
			 //gerando um numero aleatorio de 0 ate 99
			 int num = ThreadLocalRandom.current().nextInt(100);
			 
			 for(int i=0; i<chances.length;i++ ) {
				 if (num <=chances[i]) {
					 selecionados[indice] = pop.get(i);
					 indice++;
					 break;
				 }
			}//for
		 }//while
		 return selecionados;
	 }//funcao selecao
	 
   //crossover
	 
   /*Criar um sistema de porcentagem de ser selecionado de acordo com grau de aptidão*/
	 
}//populacao

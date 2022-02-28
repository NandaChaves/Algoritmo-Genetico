import java.util.concurrent.ThreadLocalRandom;
import java.util.List;
public class Mutacao {

	public void RealizaMutacao(List<Individuo> pop ) {
		int chance = 5;
		
		for (Individuo in : pop) {
			//gera porcentagem aleatoria
			int num = ThreadLocalRandom.current().nextInt(100);
			if (num < chance) {
			//seleciona um gene aleatorio do individuo 
				int i = ThreadLocalRandom.current().nextInt(in.genes.length);
				//e troca 0 por 1 ou 1 por 0
				in.genes[i] = in.genes[i] == 1 ? 0: 1;
			}
		}//for
	}//funcao RealizaMutacao
}// classe Mutacao

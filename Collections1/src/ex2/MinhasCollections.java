package ex2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MinhasCollections {
	public static void main(String[] args) {
		List<Integer> minhaLista = new ArrayList<Integer>(); //Instaciamento de um Arraylist chamado minhalista, onde vai ser adicionado todos os valores das linhas seguintes em uma lista;  
		minhaLista.add(1); // adiciona o valor 1
		minhaLista.add(2); // adiciona o valor 2
		minhaLista.add(2); // adiciona o valor 2
		
		for (Integer listaElementos : minhaLista) { // pega o valor da primeira variavel da lista e coloca seu valor em listaElementos ate acabar a execução do for, em seguida passa para o proximo valor da variavel até que a lista seja percorrida por inteira
			System.out.println(listaElementos); //imprime os valores da lista 
		}
		
		Set<Integer> meuSet = new HashSet<Integer>(); //Instaciamento de um HashSet chamado meuSet, onde vai ser adicionado todos os valores das linhas seguintes em um set;   
		meuSet.add(1); // adiciona o valor 1
		meuSet.add(2); // adiciona o valor 2
		meuSet.add(3); // adiciona o valor 3
		meuSet.add(1); // não adiciona o valor 1 pois a coleção set não aceita valores iguais
		Iterator<Integer> iMeuSet = meuSet.iterator(); //itera os itens do meuSet em iMeuSet
		while(iMeuSet.hasNext()){ // percorrera o iMeuSet
			System.out.println(iMeuSet.next()); //Mostra na tela o valor do proximo elemento do iMeuSet
		}
	}
}
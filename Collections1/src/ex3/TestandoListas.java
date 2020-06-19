package ex3;

import java.util.List;
import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>(); // cria uma lista para adionar as variaveis que contem strings a seguir:
		aulas.add(aula1); //adiciona o conteudo da variavel aula1
		aulas.add(aula2); //adiciona o conteudo da variavel aula2
		aulas.add(aula3); //adiciona o conteudo da variavel aula3
		
		System.out.println(aulas); //mostra toda a lista aulas criada acima
		System.out.println(aulas.size()); // mostra o numero de elementos da lista
		
		// cuidado! <= faz sentido aqui? não, temos que usar <, pois assim não tentariamos acessar um indice que não existe
		for (int i = 0; i < aulas.size(); i++) { // criado para acessar todos os indices da lista
			System.out.println("Aula: " + aulas.get(i)); // mostra a aula presente naquele indice
		}

	}

}

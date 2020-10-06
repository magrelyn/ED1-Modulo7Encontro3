package controle;

import modelo.BST;
import modelo.NoAluno;

public class Testes {

	public static void main(String[] args) {
		BST arv = new BST();
		arv.inserir("Nicolas");
		arv.inserir("Giovanna");
		arv.inserir("Samuel");
		arv.inserir("Beatriz");
		arv.inserir("Maria");
		arv.inserir("Pedro");
		arv.inserir("Yasmin");
		arv.inserir("Nicolas");
		arv.inserir("Marcelo");

		System.out.println("Arvore em ordem: " + arv.inOrdem());
		System.out.println("\nArvore em ordem: " + arv.inOrdem());
		System.out.println("\nArvore em ordem: " + arv.inOrdem());
		
		/*System.out.println("Alunos com nome Nicolas: ");
		
		NoAluno[] alunos = arv.busca("Nicolas");
		
		for (int i = 0; alunos[i] != null; i++) {
			System.out.println(alunos[i].toString());
		}*/
		
		// arv.remover_rec(arv.raiz, "Yasmin");
		
		// System.out.println("\nArvore em ordem: " + arv.inOrdem());
		
		
	}

}

package controle;

import modelo.BST;

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

		System.out.print("Alunos com nome Nicolas: ");

		System.out.println(arv.busca("Nicolas").toString());

		arv.remover("Marcelo");

		System.out.println("Arvore em ordem: " + arv.inOrdem());

	}

}

package controle;

import modelo.BST;
// import modelo.NoAluno;

public class TesteInserir {

	public static void main(String[] args) {
		BST arv = new BST();
		arv.inserir("Sola");
		arv.inserir("Void");
		arv.inserir("Yuri");
		arv.inserir("Boyka");
		arv.inserir("Satan");
		arv.inserir("Mateus");
		arv.inserir("Vitrola");
		arv.inserir("Farofa");
		arv.inserir("Weslley");
		arv.inserir("Rafa");
		arv.inserir("Vitao");
		arv.inserir("Sola");

		// System.out.println(arv.inOrdem());
		
		/*NoAluno[] alunos = arv.busca("Sola");
		
		for (int i = 0; alunos[i] != null; i++) {
			System.out.println(alunos[i].toString()+"\n");
		}*/
		
		arv.busca("Sola");
		
		
	}

}

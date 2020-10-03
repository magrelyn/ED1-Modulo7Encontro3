package modelo;

import testes.StringManipulatorStatic;

public class BST {
	public NoAluno raiz;

	public BST() {
	}

	public BST(NoAluno raiz) {
		this.raiz = raiz;
	}

	public void inserir(String info) {

		if (this.raiz == null) {
			NoAluno node = new NoAluno(info);
			this.raiz = node;
		} else {
			inserirRec(this.raiz, info);
		}
	}

	// metodo recursivo
	private void inserirRec(NoAluno no, String dado) {

		if (StringManipulatorStatic.isLessThan(dado, no.getInfo()))
			if (no.getEsq() == null) {
				NoAluno node = new NoAluno(dado);
				no.setEsq(node);
			} else {
				inserirRec(no.getEsq(), dado);
			}
		else {
			if (no.getDir() == null) {
				NoAluno node = new NoAluno(dado);
				no.setDir(node);
			} else {
				inserirRec(no.getDir(), dado);
			}
		}

	}

	public String posOrdem() {

		if (this.raiz != null)
			return posOrdemRec(this.raiz);
		return "Arvore vazia";
	}

	static StringBuilder s = new StringBuilder();

	// metodo recursivo
	private String posOrdemRec(NoAluno no) {

		if (no.getEsq() != null) {
			posOrdemRec(no.getEsq());
		}

		if (no.getDir() != null) {
			posOrdemRec(no.getDir());
		}

		s.append(no.getInfo() + " ");

		return s.toString();

	}

	public String inOrdem() {

		if (this.raiz != null)
			return inOrdemRec(this.raiz);
		return "Arvore vazia";
	}

	static StringBuilder s2 = new StringBuilder();

	// metodo recursivo
	private String inOrdemRec(NoAluno no) {

		if (no.getEsq() != null) {
			inOrdemRec(no.getEsq());
		}

		s2.append(no.getInfo() + " ");

		if (no.getDir() != null) {
			inOrdemRec(no.getDir());
		}

		return s2.toString();

	}

	static NoAluno alunos[] = new NoAluno[400];
	// static NoAluno alunos[];

	public /*NoAluno[]*/ void busca(String name) {

		/*if (this.raiz == null) {
			return alunos;
		} else
			return buscaRec(this.raiz, name);*/
		
		if (this.raiz == null) {
			System.out.println("vazio");
		} else
			buscaRec(this.raiz, name);

	}

	private /*NoAluno[]*/ void buscaRec(NoAluno no, String name) {
		// int i = 0;

		if (no.getInfo().equals(name)) {
			/*alunos[i] = no;
			i++;*/
			
			System.out.println(no);
		}
		
		if (StringManipulatorStatic.isLessThan(name, no.getInfo()) || no.getInfo().equals(name)) {
			if(no.getEsq() != null)
				buscaRec(no.getEsq(), name);
		}else
			if(no.getDir() != null)
				buscaRec(no.getDir(), name);

		// return alunos;
	}

}

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

		if (StringManipulatorStatic.isLessThan(dado, no.getInfo())) {
			if (no.getEsq() == null) {
				NoAluno node = new NoAluno(dado);
				no.setEsq(node);
			} else {
				inserirRec(no.getEsq(), dado);
			}
		} else {
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
	
	static StringBuilder s2;

	public String inOrdem() {
		
		s2 = new StringBuilder();

		if (this.raiz != null)
			return inOrdemRec(this.raiz);
		return "Arvore vazia";
	}

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

	public static NoAluno alunos[] = new NoAluno[400];
	// static NoAluno alunos[];

	public NoAluno[] busca(String name) {

		if (this.raiz == null)
			return alunos;
		else
			return buscaRec(this.raiz, name);

	}

	static int i = 0;

	private NoAluno[] buscaRec(NoAluno no, String name) {

		if (no.getInfo().equals(name)) {
			alunos[i] = no;
			i++;
		}

		if (!StringManipulatorStatic.isLessThan(name, no.getInfo()) || no.getInfo().equals(name)) {
			if (no.getDir() != null)
				buscaRec(no.getDir(), name);
		} else {
			if (no.getEsq() != null)
				buscaRec(no.getEsq(), name);
		}

		return alunos;
	}

	public void removew(String nome) {

		if (this.raiz != null)
			removeRecw(this.raiz, nome);
	}

	static NoAluno folha;

	private void removeRecw(NoAluno no, String nome) {

		if (no.getInfo().equals(nome))
			folha = no;

		if (no.getDir() != null)
			removeRecw(no.getDir(), nome);
		if (no.getEsq() != null)
			removeRecw(no.getEsq(), nome);

	}

	public NoAluno remover_rec(NoAluno raiz, String chave) {
		if (raiz == null)
			return null;
		if (StringManipulatorStatic.isLessThan(chave, raiz.getInfo()))
			raiz.setEsq(remover_rec(raiz.getEsq(), chave));
		else if (StringManipulatorStatic.isLessThan(raiz.getInfo(), chave))
			raiz.setDir(remover_rec(raiz.getDir(), chave));
		else if (raiz.getEsq() == null)
			return raiz.getDir();
		else if (raiz.getDir() == null)
			return raiz.getEsq();
		else
			remover_sucessor(raiz);
		return raiz;
	}

	void remover_sucessor(NoAluno raiz) {
		NoAluno t = raiz.getDir(); /* será o mínimo da subárvore direita */
		NoAluno pai = raiz; /* será o pai de t */
		while (t.getEsq() != null) {
			pai = t;
			t = t.getEsq();
		}
		if (pai.getEsq() == t)
			pai.setEsq(t.getDir());
		else
			pai.setDir(t.getDir());
		raiz.setInfo(t.getInfo());
	}

}

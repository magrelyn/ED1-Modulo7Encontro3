package modelo;

public class NoAluno {

	private String info;
	private NoAluno esq;
	private NoAluno dir;
	
	public NoAluno() {
	}
	
	public NoAluno(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public NoAluno getEsq() {
		return esq;
	}

	public void setEsq(NoAluno esq) {
		this.esq = esq;
	}

	public NoAluno getDir() {
		return dir;
	}

	public void setDir(NoAluno dir) {
		this.dir = dir;
	}
	
	public String toString() {
		return this.info;
	}

}

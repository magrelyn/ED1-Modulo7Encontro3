package util;

public class NoLista<T> {

	private T info;
	private NoLista<T> prox;

	public NoLista() {
	}

	public NoLista(T valor) {
		this.setInfo(valor);
		this.setProx(null);
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public NoLista<T> getProx() {
		return prox;
	}

	public void setProx(NoLista<T> prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		return (String) info;
	}

}
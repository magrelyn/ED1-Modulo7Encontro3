package util;

public class TestaListaGenerica {
	
	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>();
		
		lista.adiciona("a");
		lista.adiciona("b");
		lista.adiciona("c");
		lista.adiciona("d");
		lista.adiciona("e");
		
		System.out.println(lista.toString());
		
		lista.remove(1);
		
		System.out.println(lista.toString());

		lista.adiciona(1, "B");
		
		System.out.println(lista.toString());
		
		System.out.println(lista.busca(3));
		
		System.out.println(lista.busca("c"));	
		
	}

}

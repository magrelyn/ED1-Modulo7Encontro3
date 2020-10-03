package testes;


public class TestaCharAtPos {

	public static void main(String[] args) {
		StringManipulator a = new StringManipulator("boyka");
		System.out.println(			   a.isLessThan("weslley"));
		
		System.out.println(StringManipulatorStatic.isLessThan("boyka", "weslley"));

	}

}

package testes;

public class StringManipulatorStatic {

	public static boolean isLessThan(String a, String b) {

		if (a.equals(b))
			return false;

		char[] arrayA = a.toLowerCase().toCharArray();
		char[] arrayB = b.toLowerCase().toCharArray();

		if (arrayA.length > arrayB.length) {
			for (int i = 0; i < arrayB.length; i++) {
				if (arrayA[i] != arrayB[i]) {
					if (arrayA[i] < arrayB[i]) {
						return true;
					} else {
						return false;
					}
				}
				if (i == arrayB.length - 1) {
					return false;
				}
			}
		} else if (arrayA.length == arrayB.length) {
			for (int i = 0; i < arrayA.length; i++) {
				if (arrayA[i] != arrayB[i]) {
					if (arrayA[i] > arrayB[i]) {
						return false;
					} else {
						return true;
					}
				}
			}
		} else {
			for (int i = 0; i < arrayA.length; i++) {
				if (arrayA[i] != arrayB[i]) {
					if (arrayA[i] < arrayB[i]) {
						return true;
					} else {
						return false;
					}
				}
				if (i == arrayA.length - 1) {
					return true;
				}
			}

		}

		return false;
	}

}

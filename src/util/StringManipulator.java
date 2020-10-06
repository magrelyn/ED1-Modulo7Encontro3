package util;

public class StringManipulator {

	private String arg;

	public StringManipulator() {
	}

	public StringManipulator(String value) {
		this.arg = value;
	}

	public boolean isLessThan(String b) {

		if (this.arg.equals(b))
			return true;

		char[] arrayA = this.arg.toLowerCase().toCharArray();
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

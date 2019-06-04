package de.tum.in.ase.eist;

public class SimpleHashAlgorithm implements HashFunction {

	private static final int DEFAULT_SIMPLE_HASH_MAX_LENGTH = 255;
	private static final int HEXADECIMAL = 16;

	private int maxLength;

	public SimpleHashAlgorithm() {
		maxLength = DEFAULT_SIMPLE_HASH_MAX_LENGTH;
	}

	@Override
	public String calculateHashCode(String input) {
		int hash = 0;
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			hash += charArray[i];
		}
		return Integer.toString(hash % maxLength, HEXADECIMAL);
	}

}

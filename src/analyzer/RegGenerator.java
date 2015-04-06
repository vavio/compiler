package analyzer;

import java.util.HashMap;
import java.util.Scanner;

public class RegGenerator {

	static HashMap<Character, Character> keyMap;

	private static final String lowerAlphabet = "абвгдѓежзѕијклљмнњопрстќуфхцчџш";
	// potrebno e za da se napravat site bukvi mali
	private static final String upperAlphabet = "АБВГДЃЕЖЗЅИЈКЛЉМНЊОПРСТЌУФХЦЧЏШ";

	private static String toLowerCase(String text) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length(); ++i)
			sb.append(keyMap.get(text.charAt(i)));

		return sb.toString();
	}

	public static void main(String[] args) {
		// Delot za kripter
		init();
		Scanner sc = new Scanner(System.in);

		while (true) {

			String s = sc.nextLine();

			StringBuffer sb = new StringBuffer();
			// sb.append("[");
			for (int i = 0; i < s.length(); ++i) {
				sb.append(String.format("[%c%c]", s.charAt(i),
						keyMap.get(s.charAt(i))));
			}
			// sb.append("]");
			System.out.print(sb.toString());
		}
//		sc.close();
	}

	private static void init() {
		keyMap = new HashMap<Character, Character>();
		for (int i = 0; i < lowerAlphabet.length(); ++i) {
			keyMap.put(lowerAlphabet.charAt(i), upperAlphabet.charAt(i));
			keyMap.put(upperAlphabet.charAt(i), lowerAlphabet.charAt(i));
		}
	}

}

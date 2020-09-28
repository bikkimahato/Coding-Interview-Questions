import java.util.Stack;

public class PalindromeX {

	public static void main(String[] args) {
		System.out.println(checkPalindromeX("abXba"));
	}

	public static boolean checkPalindromeX(String s) {
		Stack<Character> sc = new Stack<>();
		int i = 0;
		while (s.charAt(i) != 'X') {
			sc.push(s.charAt(i));
			i++;
		}
		i++;
		do {
			if (sc.isEmpty() || i == s.length()) {
				return false;
			}
			if (sc.pop() != s.charAt(i)) {
				return false;
			}
			i++;
		} while (i < s.length());
		return true;
	}
}


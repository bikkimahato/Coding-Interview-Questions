import java.util.Stack;

public class ParenthesesBalance {

	public static void main(String[] args) {
		System.out.println(check(")"));
	}

	public static boolean check(String s) {
		if (s.length() == 0 || s == null) {
			return true;
		}
		Stack<Character> sc = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				sc.push(ch);
			} else if (ch == ')') {
				if (!sc.empty() && sc.peek() == '(') {
					sc.pop();
				} else {
					return false;
				}
			} else if (ch == '}') {
				if (!sc.empty() && sc.peek() == '{') {
					sc.pop();
				} else {
					return false;
				}
			} else if (ch == ']') {
				if (!sc.empty() && sc.peek() == '[') {
					sc.pop();
				} else {
					return false;
				}
			}
		}
		if (sc.empty()) {
			return true;
		} else {
			return false;
		}
	}

}

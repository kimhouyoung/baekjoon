
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'c' && i < str.length() - 1) {
				if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')
					i++;
			} else if (ch == 'd' && i < str.length() - 1) {
				if (str.charAt(i + 1) == 'z' && i < str.length() - 2 && str.charAt(i + 2) == '=')
					i += 2;
				else if (str.charAt(i + 1) == '-')
					i++;
			} else if ((ch == 'l' || ch == 'n') && i < str.length() - 1 && str.charAt(i + 1) == 'j')
				i++;
			else if ((ch == 's' || ch == 'z') && i < str.length() - 1 && str.charAt(i + 1) == '=')
				i++;

			count++;
		}

		System.out.println(count);
	}
}

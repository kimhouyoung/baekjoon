import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String N = sc.next();
			if(N.equals("0")) break;
			int E = 2;
			E += N.length()-1;
			for(int i = 0; i < N.length(); i++) {
				if(N.charAt(i) == '1')
					E += 2;
				else if (N.charAt(i) == '0')
					E += 4;
				else 
					E += 3;
			}
			System.out.println(E);
		}
	}
}
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b,c;
		for(int i=0;i<n;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			c=1;
			
			for (int j=0;j<b;j++) c=(c*a)%10;
			if(c==0) c=10;
			System.out.println(c);
		}
	}
}
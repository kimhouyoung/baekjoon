import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder str = new StringBuilder();

		int T = 3;
		for (int testcase = 0; testcase < T; testcase++) {
			int N = Integer.parseInt(br.readLine());
			BigInteger sum = new BigInteger("0");
			for (int i = 0; i < N; i++) {
				sum = sum.add(new BigInteger(br.readLine()));
			}
			if(sum.compareTo(new BigInteger("0")) > 0)
				str.append("+").append("\n");
			else if (sum.compareTo(new BigInteger("0")) < 0)
				str.append("-").append("\n");
			else
				str.append("0").append("\n");
		}
		System.out.println(str.toString());
		br.close();
	}
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int Y = 0, M = 0;

        for (int i = 0; i < N; i++) {
            int duration = sc.nextInt(); 
            Y += ((duration / 30) + 1) * 10;
            M += ((duration / 60) + 1) * 15;
        }

        if (Y < M) {
            System.out.println("Y " + Y);
        } else if (M < Y) {
            System.out.println("M " + M);
        } else {
            System.out.println("Y M " + Y);
        }
    }
}

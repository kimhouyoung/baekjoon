import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            printLine(n - i, i);
        }

        for (int i = n - 1; i >= 1; i--) {
            printLine(n - i, i);
        }
    }

    public static void printLine(int spaceCount, int starCount) {
        for (int i = 0; i < spaceCount; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < starCount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
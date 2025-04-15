import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = sc.nextInt();

        int base = n - (n % 100);        
        int result = base % f == 0 ? 0 : f - (base % f); 

        System.out.printf("%02d", result);
    }
}

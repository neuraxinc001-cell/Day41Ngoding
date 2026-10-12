import java.util.Scanner;
public class day41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n > 30) System.out.println("PANAS");
        else if (n >= 18) System.out.println("SEJUK");
        else System.out.println("DINGIN");
    }
}

import javax.xml.transform.Result;
import java.util.Scanner;

public class Main {
    private final static double PI = 3.14;
    private static int numero1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite su primer numero!");
        numero1 = input.nextInt();
        System.out.println(Result: " + (numero1 * PI));
    }
}




import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int karra = random.nextInt(9);
        int a = 9 * karra;

        System.out.print("9 * " + karra + " = ");
        int answer = scanner.nextInt();

        if (answer == a){
            System.out.println("Qoyil to'g'ri topdingiz");
        }else {
            System.out.println("Javob nato'g'ri qaytadan urunib ko'ring");
        }
    }
}
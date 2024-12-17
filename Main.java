import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("angka positif.");
        } else if (number < 0) {
            System.out.println("angka negatif.");
        } else {
            System.out.println("angka nol.");
        }

        scanner.close();
    }
}

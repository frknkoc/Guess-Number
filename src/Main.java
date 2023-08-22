import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number, guessNumber= 0;
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Lütfen bir sayı giriniz...");
            number = input.nextInt();
            guessNumber = (int) (Math.random() * 100);
            if (number == guessNumber){
                System.out.println("Tebrikler sayıyı doğru tahmin ettiniz!");
            } else {
                System.out.println("Maalesef sayıyı yanlış tahmin ettiniz! Sayı : "  + guessNumber + "'di");
            }
        }
    }
}
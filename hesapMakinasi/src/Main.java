import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz : ");
        int num1 = input.nextInt();
        System.out.print("ikinci sayiyi giriniz :");
        int num2 = input.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciminiz:");
        int select = input.nextInt();
        switch(select) {
            case 1:
                System.out.println("Toplama isleminin sonu:" + (num1 + num2));
                break;
            case 2:
                System.out.println("Cikarma isleminin sonu:" + (num1 - num2));
                break;
            case 3:
                System.out.println("Carpma isleminin sonu:" + num1 * num2);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Bir Sayi '0'a bolunemez");
                } else {
                    System.out.println("Bolme isleminin sonu:" + num1 / num2);
                }
                break;
            default:
                System.out.println("Yanlis Secim Yaptiniz. Tekrar deneyın");
        }

    }
}
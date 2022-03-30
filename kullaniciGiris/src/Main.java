import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanici adiniz: ");
        String userName = inp.nextLine();
        System.out.println("Sifreniz:");
        String password = inp.nextLine();
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris Yaptiniz");
        } else {
            System.out.println("Bilgileriniz Yanlis");
        }

    }
}

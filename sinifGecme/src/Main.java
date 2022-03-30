import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik;

        Scanner input=new Scanner(System.in);

        System.out.println("Matematik Notunuz:");
        matematik=input.nextInt();

        System.out.println("Fizik Notunuz:");
        fizik=input.nextInt();

        System.out.println("Turkce Notunuz:");
        turkce=input.nextInt();

        System.out.println("Kimya Notunuz:");
        kimya=input.nextInt();

        System.out.println("Muzik Notunuz:");
        muzik=input.nextInt();

        double avarage=(matematik+fizik+turkce+kimya+muzik)/5;
        if(avarage<55){
            System.out.println("Sinifta kaldiniz");
        } else {
            System.out.println("Tebrikler, sinifi gectiniz");

        }
        System.out.println("Ortalamaniz:" +avarage);
    }
}
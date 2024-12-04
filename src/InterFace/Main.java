package InterFace;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tutar giriniz: ");
        double price = input.nextDouble();

        System.out.println("Kart no giriniz");
        String cardNumber = input.next();

        System.out.println("Son kullanma tarihi giriniz");
        String date = input.next();

        System.out.println("Güvenlik kodu giriniz: ");
        String cvc = input.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.println("Lütfen Banka seçiniz: ");

        int selectBank= input.nextInt();

        switch (selectBank){
            case 1:
                ABankasi apos= new ABankasi("A Bankasi", "127.0.0.1", "12345");
                apos.connect( "127.0.0.1");
                apos.payment(String.valueOf(price),cardNumber,date,cvc);
                break;
            default:
                System.out.println("Geçerli banka giriniz");

        }

    }
}

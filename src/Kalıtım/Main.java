package Kalıtım;

public class Main {
    public static void main(String[] args) {
        //Calisan c1=new Calisan("DusanTadic", 000000, "dusan@gmail.com");
        //Akademisyen ak1= new Akademisyen("Gül Bozkurt" ,00000, "gül@gmail.com","Yazilim", "Prof");
        //ak1.DerseGir();
        Memur m1= new Memur("SofyanAmrabat",000000,"sofyan@gmail.com","OrtaSAHA",5);
        OgretimGorevlisi o1= new OgretimGorevlisi("SeySey",000000000,"sey@gmail.com", "Yazilim", "Ogretimgov",57);

        //Method overloading(Methodlarda aşırı yüklenme)
        //o1.giris("09:00");
        //o1.giris("09:00", "18:00");

        //Method overriding(Methodlarda geçersiz kılma)
        //o1.giris();

        //Polimorfizm(Çok Biçimlilik)
        //Calisan c2 = new Akademisyen("Gül Bozkurt" ,00000, "gül@gmail.com","Yazilim", "Prof");
       // c2.giris(); ===> Polimorfizim bu işe yarıyor calisan sınıfından oluşuan nesne ama akademisyen sınıfdaki method calısıyor
          Calisan[] girisYapanlar = {/*c1*/ /*ak1*/ m1, o1};
          Calisan.girisYapanlar(girisYapanlar);
    }
}

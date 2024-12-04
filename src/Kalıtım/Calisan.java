package Kalıtım;

import java.util.Objects;

public abstract class Calisan {
    private String adSoyad;
    private int telno;
    private String eposta;

    public Calisan(String adSoyad, int telno, String eposta){
        this.adSoyad= adSoyad;
        this.telno= telno;
        this.eposta=eposta;
    }

    public String getAdSoyad(){
        return this.adSoyad;
    }

    public int getTelno(){
        return this.telno;
    }

    public String getEposta(){
        return this.eposta;
    }

    public void giris(){
        System.out.println(this.adSoyad + "Üniversiteye giriş yaptı ");
    }

    public void giris(String girisSaati){
        System.out.println(this.getAdSoyad()+ " " + "öğretim görevlisi" + " " + girisSaati + "da giris yaptı");
    }

    public void giris(String girisSaati, String cikisSaati){
        System.out.println(this.getAdSoyad()+ " " + "Öğretim Görevlisi" + " " + girisSaati + "giris yaptı" + " " + cikisSaati + " "+ "da cikis yapıcak");
    }

    public void cikis(){
        System.out.println(this.adSoyad + "Üniversiteden cikis yapti");
    }

    public void yemekhane(){
        System.out.println(this.adSoyad + "Yemekhaneye giriş yaptı");
    }
    //Polimorfizm
    public static void girisYapanlar(Calisan[] girisYapanlar){
        for(Calisan c: girisYapanlar){
            c.giris();
        }
    }
}

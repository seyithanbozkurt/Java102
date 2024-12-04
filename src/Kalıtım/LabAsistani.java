package Kalıtım;

public class LabAsistani extends Asistan{
    public LabAsistani(String adSoyad, int telno, String eposta, String bolum, String unvan, int ofisSaat){
        super(adSoyad,telno,eposta,bolum,unvan,ofisSaat);

    }

    public void LablaraGir(){
        System.out.println(this.getAdSoyad() + "Lablara giris yapti");
    }

    public void DersGir(){
        System.out.println(this.getAdSoyad() + "Derse giriş yapti");
    }
}

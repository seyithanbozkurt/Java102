package Kalıtım;

public class OgretimGorevlisi extends Akademisyen{
    private int kapiNo;
    public OgretimGorevlisi(String adSoyad, int telno, String eposta, String bolum, String unvan, int kapiNo){
        super(adSoyad,telno,eposta,bolum,unvan);
        this.kapiNo=kapiNo;
    }

    public int getKapiNo(){
        return this.kapiNo;
    }

    public void setKapiNo(int kapiNo){
        this.kapiNo=kapiNo;
    }

    public void SenatoToplantisi(){
        System.out.println(this.getAdSoyad() + "Toplantıya katılım sağlandı");
    }

    public void SinavYap(){
        System.out.println(this.getAdSoyad() + "Sinavini yapti");
    }

    @Override
    public void DerseGir(){
        System.out.println(this.getAdSoyad() + "derse girdi");
    }

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + "Ögretim görevlisi B kapısından cıkis yapicak");
    }
}

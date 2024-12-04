package Kalıtım;

public abstract class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, int telno, String eposta, String bolum, String unvan){
        super(adSoyad, telno, eposta);
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String getBolum(){
        return this.bolum;
    }

    public String getUnvan(){
        return this.unvan;
    }

    public void setBolum(String bolum){
        this.bolum=bolum;
    }

    public void setUnvan(String unvan){
        this.unvan=unvan;
    }

    public abstract void DerseGir();

    public void giris(){
        System.out.println(this.getAdSoyad() + " " +"Akademisyen giris yaptı");
    }
}

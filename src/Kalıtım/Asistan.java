package Kalıtım;

public class Asistan extends Akademisyen{
    private int ofisSaat;
    public Asistan(String adSoyad, int telno, String eposta, String bolum, String unvan, int ofisSaat){
        super(adSoyad,telno,eposta,bolum,unvan);
        this.ofisSaat=ofisSaat;
    }

    public int getOfisSaat(){
        return this.ofisSaat;
    }

    public void setOfisSaat(int ofisSaat){
        this.ofisSaat=ofisSaat;
    }

    public void quizYap(){
        System.out.println(this.getAdSoyad() + "quiz yapildi");
    }

    public void DerseGir(){
        System.out.println(this.getAdSoyad() + "Asistan derse girdi");
    }
}

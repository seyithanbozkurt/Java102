package Kalıtım;

public class Memur extends Calisan{
    private String departman;
    private int mesai;

    public Memur(String adSoyad, int telno, String eposta,String departman, int mesai){
        super(adSoyad,telno,eposta);
        this.departman=departman;
        this.mesai=mesai;
    }

    public String getDepartman(){
        return this.departman;
    }

    public int getMesai(){
        return this.mesai;
    }

    public void setDepartman(String departman){
        this.departman=departman;
    }

    public void setMesai(int mesai){
        this.mesai=mesai;
    }

    public void calis(){
        System.out.println(this.getAdSoyad() + "Çalışıyor");
    }

    public void giris(){
        System.out.println(this.getAdSoyad()+" " + "Memur giris yaptı");
    }
}

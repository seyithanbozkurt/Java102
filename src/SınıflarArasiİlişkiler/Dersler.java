package SınıflarArasiİlişkiler;

public class Dersler {
   private String dersAdi;
   private int dersKodu;
   private Akademisyen akademisyen;

    Dersler(String dersAdi, int dersKodu, Akademisyen akademisyen){
        this.dersAdi=dersAdi;
        this.dersKodu=dersKodu;
        this.akademisyen=akademisyen;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public int getDersKodu() {
        return dersKodu;
    }

    public Akademisyen getAkademisyen() {
        return akademisyen;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public void setDersKodu(int dersKodu) {
        this.dersKodu = dersKodu;
    }

    public void setAkademisyen(Akademisyen akademisyen) {
        this.akademisyen = akademisyen;
    }

    public double ort(Ogrenci[] ogrenci){
        double ort=0.0;

        for (Ogrenci value : ogrenci) {
            ort += value.getNote();
        }
        return ort / ogrenci.length;

    }
}

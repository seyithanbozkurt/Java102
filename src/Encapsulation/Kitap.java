package Encapsulation;

public class Kitap {
    private String kitapAdi;
    private String yazar;
    private int sayfaSayisi;

    public Kitap(String kitapAdi,String yazar, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazar=yazar;
        if(sayfaSayisi < 0) {
            this.sayfaSayisi =0;
        } else{
                this.sayfaSayisi=sayfaSayisi;
            }

    }

    public int getSayfaSayisi(){
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi){
        if(sayfaSayisi < 0){
            this.sayfaSayisi=0;
        }else{
            this.sayfaSayisi=sayfaSayisi;
        }
    }

    public void print(){
        System.out.println(kitapAdi + " " + yazar + " " + sayfaSayisi);
    }
}

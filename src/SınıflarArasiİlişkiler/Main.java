package SınıflarArasiİlişkiler;

public class Main {
    public static void main(String[] args) {


        Ogrenci ogr1 = new Ogrenci("Gül", "Bozkurt", 1216, 85, "AA");
        Ogrenci ogr2 = new Ogrenci("Seysey", "Bozkurt", 1234, 45, "CC");
        System.out.println(ogr1.getAdress());

        Akademisyen a1= new Akademisyen("Seyithan", "Bozkurt", "Mat");
        Akademisyen a2= new Akademisyen("Ahmet", "Yılmaz", "Fzk");

        Dersler d1 = new Dersler("MAT", 33,a1);
        Dersler d2 = new Dersler("FZK",44,a2);
        System.out.println(d1.getDersAdi() + " " + d1.getDersKodu() + " " + d1.getAkademisyen().getName());
        Ogrenci[] og={ogr1,ogr2};
        d1.ort(og);
        System.out.println(d1.ort(og));
    }
}

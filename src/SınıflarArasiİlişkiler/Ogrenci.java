package SınıflarArasiİlişkiler;

public class Ogrenci {
    private String name;
    private String surname;
    private int no;
    private int note;
    private String adress;

    public Ogrenci(String name, String surname, int no, int note, String adress) {
        this.name = name;
        this.surname = surname;
        this.no = no;
        this.note = note;
        this.adress = adress;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getNo(){
        return this.no;
    }

    public int getNote(){
        return this.note;
    }

    public String getAdress(){
        return this.adress;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

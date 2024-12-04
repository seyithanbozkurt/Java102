package Encapsulation;

public class Main {
    public static void main(String[] args) {
      Kitap book = new Kitap("Harry potter", "Gül", -100);
      book.setSayfaSayisi(-100);
      book.print();
    }
}
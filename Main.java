package sample;
public class Main{

    public static void main(String[] args) {
        Kalkulator aw = new Kalkulator();
        aw.setangka1(50);
        aw.setangka2(5);
        aw.setHasilpenjumlahan(aw.getangka1() + aw.getangka2());
        System.out.println("Fadhil Munif Dermawan");
        System.out.println("Angka 1           = " +aw.getangka1());
        System.out.println("Angka 2           = " +aw.getangka2());
        System.out.println("===================================");
        System.out.println("Hasil Penjumlahan = "+aw.getHasilpenjumlahan());
        System.out.println("Hasil Pengurangan = "+aw.getHasilpengurangan());
        System.out.println("Hasil Perkalian   = "+aw.getHasilpekrkalian());
        System.out.println("Hasil Pembagian   = "+aw.getHasilpembagian());
        System.out.println("===================================");

    }
}
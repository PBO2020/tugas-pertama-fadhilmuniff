package sample;

public class Kalkulator {

    int angka1;

    public int getangka1() {
        return angka1;
    }

    public void setangka1(int angka1) {
        this.angka1= angka1;
    }

    int angka2;

    public int getangka2() {
        return angka2;
    }

    public void setangka2(int angka2) {
        this.angka2 = angka2;
    }
    int hasilpenjumlahan;

    public int getHasilpenjumlahan() {
        hasilpenjumlahan = angka1 + angka2;
        return hasilpenjumlahan;
    }

    public void setHasilpenjumlahan(int hasilpenjumlahan) {
        this.hasilpenjumlahan = hasilpenjumlahan;
    }
    int hasilpengurangan;

    public int getHasilpengurangan() {
        hasilpengurangan = angka1 - angka2;
        return hasilpengurangan;
    }

    public void setHasilpengurangan(int hasilpengurangan) {
        this.hasilpengurangan = hasilpengurangan;
    }
    int hasilpekrkalian;

    public int getHasilpekrkalian() {
        hasilpekrkalian = angka1 * angka2;
        return hasilpekrkalian;
    }

    public void setHasilpekrkalian(int hasilpekrkalian) {
        this.hasilpekrkalian = hasilpekrkalian;
    }
    int hasilpembagian;

    public int getHasilpembagian() {
        hasilpembagian = angka1 / angka2;
        return hasilpembagian;
    }

    public void setHasilpembagian(int hasilpembagian) {
        this.hasilpembagian = hasilpembagian;
    }


}

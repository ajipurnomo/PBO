/*
NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menghitung beberapa operasi matematika sekaligus hanya dengan 
           memasukkan angka yang ingin dijumlahkan

 */
package if2_10117073_latihan48_kalkulator;

public class Kalkulator {
    private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }
    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }
    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setNameProject() {
        System.out.println("Project Calculator");
    }

    public void setNoteProject(String note) {
        System.out.println(note);
    }

    public double add(double val1, double val2){return val1+val2;}
    public double minus(double val1, double val2){return val1-val2;}
    public double multiplication(double val1, double val2){return val1*val2;}
    public double division(double val1, double val2){return val1/val2;}
}

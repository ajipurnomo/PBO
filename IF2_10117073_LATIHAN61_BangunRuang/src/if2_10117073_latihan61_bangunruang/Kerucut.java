/*
NIM     : 10117073;
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : menghitung volume dari bangun ruang

 */
package if2_10117073_latihan61_bangunruang;

public class Kerucut extends BangunRuang{
    private double jarijari;
    private double tinggi;
   

    
    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
   
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    
    @Override
    public double hitungVolume() {
        return (3.14*(jarijari*jarijari)*tinggi)/3;
    }
    
}

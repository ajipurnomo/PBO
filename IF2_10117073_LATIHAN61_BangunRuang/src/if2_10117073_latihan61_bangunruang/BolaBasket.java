/*
NIM     : 10117073;
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : menghitung volume dari bangun ruang
 */
package if2_10117073_latihan61_bangunruang;
public class BolaBasket extends BangunRuang{
    private double jarijari;

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    

    @Override
    public double hitungVolume() {
        return (4*3.14*(jarijari*jarijari*jarijari))/3;
    }
    
}

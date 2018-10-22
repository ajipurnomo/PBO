/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menghitung kubus
 */
package if2_10117073_latihan41_massajenis;


public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }
    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        return  parSisi*parSisi*parSisi;       
    }
    
    public int hitungMassaJenis(int parMassa, int parVolume){                
        return parMassa / parVolume;
    }
}

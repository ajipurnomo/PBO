/*
NAMA   : AJI PURNOMO
NIM    : 10117073
KELAS  : IF 2
Deskripsi : program untuk menghitung jari-jari, luas, dan keliling lingkaran hanya dengan memasukkan nilai diameternya
 */
package if2_10117073_latihan38_perhitunganlingkaran;
public class IF2_10117073_LATIHAN38_PerhitunganLingkaran {

    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
    
}

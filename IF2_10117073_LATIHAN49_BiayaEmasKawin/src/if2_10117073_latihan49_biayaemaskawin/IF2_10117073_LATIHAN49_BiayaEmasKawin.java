/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menghitung biaya yang harus dibayar untuk membeli emas
            dengan kuantitas sekian gram berdasarkan harga emas per gram

 */
package if2_10117073_latihan49_biayaemaskawin;

public class IF2_10117073_LATIHAN49_BiayaEmasKawin {

    public static void main(String[] args) {
        Emas emas = new Emas();
        String nama = "Hendi";
        System.out.println(nama+"akan membeli emas kawin seberat "+emas.beratEmas+" gram");
        System.out.println("Harga emas 1 gram per bulan Oktober ini adalah Rp."+emas.hargaEmas);
        System.out.println("Total yang harus dibayar oleh Hendi adalah Rp."+emas.hitungBayar(0));
    }
    
}

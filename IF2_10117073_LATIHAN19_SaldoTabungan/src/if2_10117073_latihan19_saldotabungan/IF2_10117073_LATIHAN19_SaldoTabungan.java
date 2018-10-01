/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi : menghitung saldo tabungan setelah terkena bunga dlm jangka waktu sekian bulan
 */
package if2_10117073_latihan19_saldotabungan;
import java.util.Scanner;

public class IF2_10117073_LATIHAN19_SaldoTabungan {
                
    public static void main(String[] args) {
       int saldoAwal;
        int bunga; // persen bunga
        int jbunga; // jumlah bunga
        int lamaBulan;
        
        //variabel yang diberi value
        saldoAwal = 2500000;
        bunga = 15;
        lamaBulan = 6;
        
        //proses looping selama 6x
        for (int i = 1; i <= lamaBulan; i++) {
            //rumus 
            jbunga = saldoAwal*bunga/100;
            saldoAwal += jbunga;
            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
        }
      
      
      
         } //public static

} //public static void   


/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi : mengetahui target saldo yg bisa tercapai dalam kurun waktu sekian
 */
package if2_10117073_latihan20_targetsaldotabungan;
public class IF2_10117073_LATIHAN20_TargetSaldoTabungan {

    public static void main(String[] args) {
        int i;
        int saldoAwal;
        int bunga; // persen bunga
        int jbunga; // jumlah bunga
        int saldoTarget;
        
        // variabel yang diberi value
        saldoAwal = 3500000;
        bunga = 8;
        saldoTarget = 6000000;
        
        System.out.println("Saldo Awal : "+saldoAwal);
        System.out.println("Bunga : "+bunga+"%");
        System.out.println("Target Saldo : "+saldoTarget);
        System.out.println("");
        // proses looping sampai mencapai target
        i=1; //inisialisasi variabel i=1
        while (saldoAwal <= saldoTarget) {
            //rumus 
            jbunga = saldoAwal*bunga/100;
            saldoAwal += jbunga;
            //menampilkan dengan format tertentu
            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;//increase variabel i -> untuk mengontrol perhitungan bulan
        }
    }
    
}

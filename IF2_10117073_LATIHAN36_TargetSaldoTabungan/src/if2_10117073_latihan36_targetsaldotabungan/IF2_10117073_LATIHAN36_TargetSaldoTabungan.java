/*
 NAMA   : AJI PURNOMO
NIM    : 10117073
KELAS  : IF 2
Deskripsi : Program untuk melihat pencapaian tabungan perbulan dan
           membandingkan dengan target angka yang kita inginkan. Sehingga kita
           bisa tau target kita bisa tercapai pada bulan ke berapa.
 */
package if2_10117073_latihan36_targetsaldotabungan;

public class IF2_10117073_LATIHAN36_TargetSaldoTabungan {
    public static void main(String[] args) {
        Saldotabungan tab = new Saldotabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo,saldoTarget);
    }
    
}

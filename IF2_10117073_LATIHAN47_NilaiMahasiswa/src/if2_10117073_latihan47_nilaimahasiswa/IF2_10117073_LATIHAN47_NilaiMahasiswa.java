/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menghitung nilai ahir, Index nilai, serta keterangan berdasarkan
            nilai quiz, uas, dan uts
 
 */
package if2_10117073_latihan47_nilaimahasiswa;
public class IF2_10117073_LATIHAN47_NilaiMahasiswa {
    public static void main(String[] args) {
       Nilai nm = new Nilai(60,80,75);

        System.out.println("QUIZ \t = "+nm.getQuiz());
        System.out.println("UTS \t = "+nm.getUts());
        System.out.println("UAS \t = "+nm.getUas());
        System.out.println("\nNilai Akhir = "+ nm.nilaiAkhir());
        System.out.println("\nIndex = "+ nm.indexNilai());
        System.out.println("Keterangan = "+ nm.keterangan());

    }
    
}

/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan identitas sebagai dosen dan sebagai mahasiswa

 */
package if2_10117073_latihan52_siapakamu;
public class IF2_10117073_LATIHAN52_SiapaKamu {

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");//------------------------
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10110269");
        System.out.println("NIM MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
        
        
    }
    
}

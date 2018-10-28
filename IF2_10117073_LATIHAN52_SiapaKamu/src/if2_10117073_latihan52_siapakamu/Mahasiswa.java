/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan identitas sebagai dosen dan sebagai mahasiswa
 */
package if2_10117073_latihan52_siapakamu;

public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;
    //------------------
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public void kelasApa(){
        setNama("Nindi");
        setUmur(17);
        setKelas("PBO2");        
        System.out.println("Saya "+getNama()+" umur "+getUmur()+" tahun sedang "
                + "belajar di kelas "+getKelas());
    }

    @Override //mengambil method yg ada di parent
    public void siapaKamu() { 
        System.out.println("Saya Mahasiswa");
    }
    
    
}

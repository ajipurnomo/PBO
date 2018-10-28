/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan identitas sebagai dosen dan sebagai mahasiswa

 */
package if2_10117073_latihan52_siapakamu;
public class Manusia {
    protected String nama;
    protected int umur;
    //-----------------
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void siapaKamu(){
        System.out.println("Saya Manusia");
    }
    
}

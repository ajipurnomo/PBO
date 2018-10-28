/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan identitas sebagai dosen dan sebagai mahasiswa

 */
package if2_10117073_latihan52_siapakamu;
public class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;
    //-----------------------
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public void mengajarApa(){
        setNama("Rizki Adam Kurniawan");
        setUmur(27);
        mataKuliah = "PBO";
        System.out.println("Saya "+getNama()+" umur "+getUmur()+" tahun sedang "
                + "mengajar matakuliah "+mataKuliah);
    }

    @Override //mengambil method yg ada di parent
    public void siapaKamu() { 
        System.out.println("Saya Dosen");
    }
    
}

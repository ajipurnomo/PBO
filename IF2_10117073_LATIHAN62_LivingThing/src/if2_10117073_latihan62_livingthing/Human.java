/*
NIM     : 10117073
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : menampilkan aktivitas manusia dengan cara hanya memanggil anak kelasnya saja
            TANPA memanggil kelas parentnya.

 */
package if2_10117073_latihan62_livingthing;

public class Human extends LivingThing{
    private String nama;
    //--------------------------------
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk(String nama) {
        super.walk(nama);         
    }

    
    
    
    
}

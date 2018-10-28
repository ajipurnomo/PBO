/*
NIM     : 10117073;
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : program untuk mengetahui karakter toko di film detective Conan
 */
package if2_10117073_latihan59_detectiveconan;

import java.util.Scanner;

public class Tokoh extends Karakter{
   private String nama;
   
    public Tokoh(String kar) {
        super(kar);
               
    }  
    
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
   
}

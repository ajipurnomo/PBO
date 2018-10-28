/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menentukan warna berdasarkan koordinat

 */
package if2_10117073_latihan54_koordinat;
public class WarnaKoordinat extends Koordinat{
    String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y); //biar tau var apa aja yg ada di parentnya 
        namaWarna = "Jingga";      
        System.out.println("Warna Koordinat : "+namaWarna);
       
    }

    public String getNamaWarna() {
        return namaWarna;
    }
    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
    
}

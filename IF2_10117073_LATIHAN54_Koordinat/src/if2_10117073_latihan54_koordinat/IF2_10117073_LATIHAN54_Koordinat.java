/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menentukan warna berdasarkan koordinat

 */
package if2_10117073_latihan54_koordinat;
public class IF2_10117073_LATIHAN54_Koordinat {
    public static void main(String[] args) {
        Koordinat koor = new WarnaKoordinat(0, 0, "warna");
        koor.setX(10);
        koor.setY(4);
        
         System.out.println("Koordinat sumbu x : "+koor.getX()+", y : "+koor.getY());
       
    }
    
}

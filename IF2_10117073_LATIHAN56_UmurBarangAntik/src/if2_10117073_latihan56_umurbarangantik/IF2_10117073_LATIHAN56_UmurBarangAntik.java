/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan tentang nama dan usia barang antik

 */
package if2_10117073_latihan56_umurbarangantik;
public class IF2_10117073_LATIHAN56_UmurBarangAntik {

    public static void main(String[] args) {
       Radio radio = new Radio(0);
      
       radio.setName("Radio AM");
        System.out.println("Nama barang antik : "+radio.getName());
        radio.tampilUmur();
    }
}

/*
NIM     : 10117073
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : menampilkan aktivitas manusia dengan cara hanya memanggil anak kelasnya saja
            TANPA memanggil kelas parentnya.
 */
package if2_10117073_latihan62_livingthing;
public class IF2_10117073_LATIHAN62_LivingThing {
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Rizki Adam Kurniawan");
        
        System.out.print(human.getNama()+" ");human.walk("");
        System.out.print(human.getNama()+" ");human.breath("");
        System.out.print(human.getNama()+" ");human.eat("");
    }
    
}

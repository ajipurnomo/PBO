/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menghitung besar tegangan berdasarkan kuat arus dan hambatan

 */
package if2_10117073_latihan44_hukumohm;
public class IF2_10117073_LATIHAN44_HukumOhm {

    public static void main(String[] args) {
        float tegangan;
        System.out.println("===Hukum Ohm===");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
                + "akan berbanding lurus dengan beda potensial \npada ujung-ujung"
                + " kawat penghantar tersebut asalkan suhu kawat dijaga konstan.");
        
        Baterai btr = new Baterai(3, 12);
              
        System.out.println("Hasil Tegangan = "+btr.hitungTegangan(3, 12)+" volt");
    }
    
}

/*
NIM     : 10117073
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : menghitung gradien berdasarkan nilai x dan y
 */
package if2_10117073_latihan63_gradiengarislurus;

public class IF2_10117073_LATIHAN63_GradienGarisLurus {

    public static void main(String[] args) {
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);   
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
      
        System.out.println("Garis yang melalui titik ("+koordinat1.getX1()+","+
                koordinat1.getY1()+") dan ("+koordinat1.getX2()+","+koordinat1.getY2()+") "
                + "memiliki gradien sebesar "+koordinat1.hitungGradien());
        
        System.out.println("Garis yang melalui titik ("+koordinat2.getX1()+","+
                koordinat2.getY1()+") dan ("+koordinat2.getX2()+","+koordinat2.getY2()+") "
                + "memiliki gradien sebesar "+koordinat2.hitungGradien());
        
        
    }
    
}

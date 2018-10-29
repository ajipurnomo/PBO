/*
NIM     : 10117073
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : menghitung volume dari bangun ruang
 */
package if2_10117073_latihan61_bangunruang;
public class IF2_10117073_LATIHAN61_BangunRuang {

    public static void main(String[] args) {
        BolaBasket bola = new BolaBasket();
        bola.setJarijari(7);
        System.out.println("Volume Bola = "+bola.hitungVolume());
               
        Tabung tabung = new Tabung();
        tabung.setJarijari(10);
        tabung.setTinggi(21);
        System.out.println("Volume Tabung = "+tabung.hitungVolume());
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJarijari(14);
        kerucut.setTinggi(9);
        System.out.println("Volume Kerucut = "+kerucut.hitungVolume());
        
       
    }
    
}

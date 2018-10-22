/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menghitung Energi Kinetik berdasarkan massa dan keepatan benda
 */
package if2_10117073_latihan50_energikinetik;

/**
 *
 * @author user
 */
public class IF2_10117073_LATIHAN50_EnergiKinetik {
    public static void main(String[] args) {
        perhitunganEK hitung = new perhitunganEK();
        
        int massa = 145;
        int kecepatan = 25;
        System.out.println("Bola Baseball dengan massa "+massa+" gram dilempar"
                + "dengan kecepatan"+kecepatan+" m/s");
        System.out.println("Maka Energi Kinetiknya sebesar "+hitung.EK+" Joule");
        System.out.println("Usaha yang dilakukan pada bola untuk mencapai "
                + "kecepatan ini "+hitung.usaha+" Joule");
        System.out.println("");
        System.out.println("CATATAN : dikarenakan kecepatan awal tidak diketahui "
                + "maka kecepatan awal dianggap 0, sehingga selisih EK terlihat sama dengan nilai EK");
    }
    
}

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
public class perhitunganEK {
    private double massa = 145; // ini diprivat karena nanti di MAIN juga mau
                                // mendeklarasikan massa sebagai cerita soal. 
                                
    private double kecepatan = 25; // ini diprivat karena nanti di MAIN juga mau
                                  //mendeklarasikan kecepatan sebagai cerita soal
    double EK = 0.5 * massa * (kecepatan*kecepatan);
    double usaha = 0.5 * massa * ((kecepatan*kecepatan) - (0*0));
}

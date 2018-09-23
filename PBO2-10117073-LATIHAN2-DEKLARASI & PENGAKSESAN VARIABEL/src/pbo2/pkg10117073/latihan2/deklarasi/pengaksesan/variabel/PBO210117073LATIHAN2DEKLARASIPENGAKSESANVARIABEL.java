/*
 * NAMA       : AJI PURNOMO
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117073
 * DESKRIPSI PROGRES : Program ini berisi pendeklarasian 
 * dan pengaksesan variabel
 */
package pbo2.pkg10117073.latihan2.deklarasi.pengaksesan.variabel;

/**
 *
 * @author ZeroXploit
 */
public class PBO210117073LATIHAN2DEKLARASIPENGAKSESANVARIABEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiInt;
        final double PHI = 3.14;
        boolean nilaiLogika;
        char nilaiKarakter;

        //memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';

        //menamilkan hasil
        System.out.println();
        System.out.println("Isi Variabel Nilai\t= " + nilaiInt);
        System.out.println("Isi Variabel PHI\t= " + PHI);
        System.out.println("Isi Variabel Logika\t= " + nilaiLogika);
        System.out.println("Isi Variabel Karakter\t= " + nilaiKarakter);
    }

}

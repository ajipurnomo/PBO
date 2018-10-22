/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menghitung nilai ahir, Index nilai, serta keterangan berdasarkan
            nilai quiz, uas, dan uts

*/

package if2_10117073_latihan47_nilaimahasiswa;
public class Nilai {
   
   private char indeks;
   private double quiz;
    private double uts;
    private double uas;
    private double na;
    private char index;

    public Nilai(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }

    public double nilaiAkhir() {
        quiz = quiz * 0.2;
        uts = uts * 0.3;
        uas = uas * 0.5;
        double na = quiz+uts+uas;
    return this.na=na;}

    public char indexNilai() {
        char idx = ' ';
        if (80 < na && na <= 100) {idx='A';}
        else if (68 < na && na <= 80) {idx='B';}
        else if (56 < na && na <= 68) {idx='C';}
        else if (45 < na && na <= 56) {idx='D';}
        else if (0 < na && na <= 45) {idx='E';}
        else {idx = '-';}
    return this.index=idx;}

    public String keterangan() {
        String ket = " ";
        switch (index) {
            case 'A':  ket="Sangat Baik"; break;
            case 'B':  ket="Baik"; break;
            case 'C':  ket="Cukup"; break;
            case 'D':  ket="Kurang"; break;
            case 'E':  ket="Sangat Kurang"; break;
        }
    return ket;}
 
}
   
    


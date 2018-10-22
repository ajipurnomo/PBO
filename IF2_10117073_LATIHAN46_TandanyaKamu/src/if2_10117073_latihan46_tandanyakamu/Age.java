/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk mendeskripsikan orang sesuai usianya

 */
package if2_10117073_latihan46_tandanyakamu;
import java.util.Calendar;

public class Age {
    private int yearBirth;
    private int yearNow;
    private static String red = "\u001B[31m";
    
    public Age(int yearBirth){      
    }
    //GET & SET YearBirth
    public int getYearBirth() {
        return yearBirth;
    }
    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    //-----------------------
    public int getYearNow() {
        Calendar kalender = Calendar.getInstance();
        int tahunsekarang = kalender.get(Calendar.YEAR);
        return tahunsekarang;
    }
    //----------------------
    public int hitungUmur (int umur){
        umur =  getYearNow()-yearBirth ;
        return umur;
    }
    //----------------------
    public String tandanyaKamu(int umur){
        String keterangan = "";
       if (0 < umur && umur <= 5){
            keterangan = "LAGI LUCU_LUCUNYA";
        }else if (5 < umur && umur <= 10){
             keterangan = "MASIH ANAK-ANAK";
        }else if (10 < umur && umur <= 13){
             keterangan = "MASIH REMAJDA";
        }else if (13 < umur && umur <=19){
             keterangan = "ALAY";
        }else if (19 < umur && umur <=29){
             keterangan = "LAGI GALAU NYARI JODOH";
        }else if (19 < umur && umur <=35){
             keterangan = "LAGI SIBUK NYARI UANG";
        }else if (35 < umur && umur <=150){
             keterangan = "SUDAH TUA";
        }else 
             keterangan = "TIDAK TERDEKSI DI KEHIDUPAN";
        
    return red+keterangan ;
    }//public static
}




     /*
        }else if ( (getYearBirth() > 5) && (getYearBirth() <= 10) ){
            System.out.println("MASIH ANAK-ANAK");
        }else if ( (getYearBirth() > 10) && (getYearBirth()<= 13) ){
            System.out.println("MASIH REMAJDA");
        }else if ( (getYearBirth() > 13) && (getYearBirth()<= 19) ){
            System.out.println("ALAY");
        }else if ( (getYearBirth() > 19) && (getYearBirth()<= 29) ){
            System.out.println("LAGI GALAU NYARI JODOH");
        }else if ( (getYearBirth() > 29) && (getYearBirth()<= 35) ){
            System.out.println("LAGI SIBUK NYARI UANG");
        }else if ( (getYearBirth() > 35) && (getYearBirth()<= 150) ){
            System.out.println("SUDAH TUA");
        }else 
            System.out.println("TIDAK TERDEKSI DI KEHIDUPAN");
           */
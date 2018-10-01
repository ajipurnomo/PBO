/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi : menampilkan hari, tanggal, dan jam dengan real time yg terkoneksi
            dengan sistem komputer
 */
package if2_10117073_latihan26_waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IF2_10117073_LATIHAN26_WaktuSaatIni {

    public static void main(String[] args) {
      Date tanggal = new Date();
      Calendar tgl = Calendar.getInstance();
      int daysOfWeek = tgl.get(Calendar.DAY_OF_WEEK);
      
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyy HH:mm:ss");
        String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamus","Jumat"};
        System.out.println("");
        System.out.println("Hari "+(strDays[daysOfWeek])+","+sdf.format(tanggal));
    }
    
}

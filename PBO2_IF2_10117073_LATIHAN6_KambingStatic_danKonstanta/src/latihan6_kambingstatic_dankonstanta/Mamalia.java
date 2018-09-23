//NAMA    : Aji Purnomo
//KELAS   : IF 2
//NIM     : 10117073
//Deskripsi program :
package latihan6_kambingstatic_dankonstanta;


public class Mamalia {
    //variabel jumlah kambing dideklarasikan sebagai statik
    public static int jumlahKambing;
    }
    
public class KambingStatic {
    //NAMA kambing sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING+ "memiliki kambing sebanyak" 
                           +Mamalia.jumlahKambing);
    }
    
}

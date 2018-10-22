/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menghitung besar tegangan berdasarkan kuat arus dan hambatan

 */
package if2_10117073_latihan44_hukumohm;
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
         
    }
    //-----------------------------
    public Baterai(float kuatArus, float hambatan){
        System.out.println("Kuat Arus : "+kuatArus+" ampere");
        System.out.println("Hambatan  : "+hambatan+" ohm");
    }
    //-----------------------------
    public float getKuatArus() {
        return kuatArus;
    }
    public float getHambatanArus() {
        return hambatan;
    }
    //-----------------------------
    public float hitungTegangan (float kuatArus, float hambatan){
      float hasil = kuatArus * hambatan;
      return hasil;
       
    }
    
}

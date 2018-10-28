/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk mengitung gaji karyawan

 */
package if2_10117073_latihan51_gajikaryawan;
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;
    //-------------------------------
    public int getKehadiran() {
        return kehadiran;
    }
    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        return tunjanganKehadiran = kehadiran*100;
    }
    public float tunjanganJabatan (String jabatan){
        switch (jabatan) {
            case "Manager":
                tunjanganJabatan=2000000;
                break;
            case "Kabag":
                tunjanganJabatan=1000000;
                break;
            default:
                tunjanganJabatan=0;
                break;
        }
        return tunjanganJabatan;
    }
    public  float tunjanganGolongan(int golongan){
        switch (golongan){
            case 1 : tunjanganGolongan = 500000; break;
            case 2 : tunjanganGolongan = 1000000; break;
            case 3 : tunjanganGolongan = 1500000; break;
        }
        return tunjanganGolongan;
    }
    
        public float gajiTotal(){
            float gaji;
            gaji= tunjanganKehadiran+tunjanganJabatan+tunjanganGolongan;
            return gaji;
        };
}//public class 

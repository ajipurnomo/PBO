/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan tentang nama dan usia barang antik

 */
package if2_10117073_latihan56_umurbarangantik;
public class Radio extends BarangAntik{
    private String name;

    public Radio(int umur) {
        super(0);     
    }

    @Override
    public void tampilUmur() {
        super.tampilUmur(); 
    }

    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
}

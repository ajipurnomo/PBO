/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menentukan warna berdasarkan koordinat
 */
package if2_10117073_latihan54_koordinat;
public class Koordinat {
    protected int x;
    protected int y;
    
    //ini yg namanya Konstruktor, nama method SAMA dgn nama class dan bebas kasih parameter apapun,
    //tanpa wajib return
    public Koordinat(int x, int y){ 
        
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
}

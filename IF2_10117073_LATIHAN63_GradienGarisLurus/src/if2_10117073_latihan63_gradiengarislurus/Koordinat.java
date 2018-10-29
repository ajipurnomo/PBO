/*

NIM     : 10117073
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : menghitung gradien berdasarkan nilai x dan y
 */
package if2_10117073_latihan63_gradiengarislurus;
public class Koordinat implements GarisLurus{
    private int x1 = 2;
    private int y1 = 10;
    private int x2 = 5;
    private int y2 = 7;

    public Koordinat(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        
        
    }
    
    public int getX1() {
        return x1;
    }
    public int getY1() {
        return y1;
    }
    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }
    

    @Override
    public int hitungGradien() {
        return (y1-y2)/(x1-x2);
        
       
    }

    
    
    
}

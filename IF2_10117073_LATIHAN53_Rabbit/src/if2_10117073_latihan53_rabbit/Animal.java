/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan deskripsi hewan

 */
package if2_10117073_latihan53_rabbit;

public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    //------------------------
   public Animal(boolean vegetarian, String food, int legs){
       
   }
   public boolean isVegetarian(){
        return vegetarian; 
   }
   public String getEats(){
        return eats;
    }
    public int getNoOfLegs(){
        return noOfLegs;
    }
}

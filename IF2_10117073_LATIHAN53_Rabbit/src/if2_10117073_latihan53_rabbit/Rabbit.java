/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan deskripsi hewan

 */
package if2_10117073_latihan53_rabbit;

public class Rabbit extends Animal{
    private String name; 
    private final String color;

    public Rabbit(String name, boolean veg, String food) {
        super(false, null, 0);
        name = "Peter";
        veg = false;
        food = "grass";
        noOfLegs = 4;
        color = "grey";
        System.out.println("Hello, His name is "+name);
        System.out.println(name+" is Vegetarian ? "+veg);
        System.out.println("Peter eats "+food);
        System.out.println("Peter has "+noOfLegs+" legs");
        System.out.println("Peter color is "+color);
    }

    public String getColor() {return color;}
    public String getName() {return name;}
    
}//end public class

    

    
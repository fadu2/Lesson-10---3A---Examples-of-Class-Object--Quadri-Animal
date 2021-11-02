public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        APRectangle rect1 = new APRectangle(3, 4); // creates object rect1
        System.out.println(rect1.getPerimeter()); // gets perimeter 
        System.out.println(rect1.getArea());  // gets area of rectangle rect1
        System.out.println(rect1.isSquare());   // no
        APRectangle rect2 = new APRectangle(4, 4); 
        System.out.println(rect2.isSquare());  // yes
        
        //Create animals
        Animal c1 = new Animal("Cat", 4, "white");
        System.out.println(c1.getColor()); // white
        System.out.println(c1.getLegs());  // 4
        c1.setColor("black");
        System.out.println(c1.getColor());  // black
        Animal d1 = new Animal("Dog", 7, "purple");
        System.out.println(d1.getType());  // Dog 
        System.out.println(d1.getPopulation());
        System.out.println(c1.getPopulation());
        System.out.println(Animal.getPopulation());
        
        // final - creates a constant "variable"
        int x = 4;
        x = 7;
        System.out.println(x);
        
        final double pi = 3.14;
        //pi = 3.1415;
        
        
    }
    
}

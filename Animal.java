public class Animal {
    // instance variable
    private String type;
    private int legs;
    private String color;
    private static int population = 0;
    
    // Constructor method
    public Animal(String t, int l, String c)
    {
        type = t;
        legs = l;
        color = c;
        population++;
    }
    
    // Get method for type
    public String getType()
    {
       return type;
    }
    
    // Get method for legs
    public int getLegs()
    {
        return legs;
    }
    
    // Get method for color
    public String getColor()
    {
        return color;
    }
    
    // Set method for type 
    public void setType(String t)
    {
        type = t;
    }
    
    // Set method for legs 
    public void setLegs(int l)
    {
        legs = l;
    }
    
    // Set method for color
    public void setColor(String c)
    {
        color = c;
    }
    
    // get method for population
    public static int getPopulation()
    {
        return population;
    }
    
}

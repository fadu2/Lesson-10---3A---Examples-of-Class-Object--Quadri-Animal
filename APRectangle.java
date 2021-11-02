public class APRectangle {
    // list instance variables / properties
    private int length;
    private int width;
    
    // constructor
    public APRectangle(int l, int w)
    {
        length = l;
        width = w;
    }
    
    // Get method for perimeter
    public int getPerimeter()
    {
        return 2 * length + 2 * width;
    }
    // Get method for area 
    public int getArea()
    {
        return length * width;
    }
    // get method for length
    public int getLength()
    {
        return length;
    }
    
    // get method for width
    public int getWidth()
    {
        return width;
    }
    
    // set method for length 
    public void setLength(int l)
    {
        length = l;
    }
    
    // set method for width  
    public void setWidth(int w)
    {
        width = w;
    }
    
    public String isSquare()
    {
        if(length == width)
        {
            return "yes";
        }
        else
        {
            return "no";
        }
    }
}

public class shape
{
	public staic void main(String[]args);
	{
   private double height;  // To hold height.
   private double width;  //To hold width or base

   // Set height and width
   public void setValues(double height, double width)
   {
      this.height = height;
      this.width = width;
   }

   //Get height
   public double getHeight() 
   {
       return height;
   }
     
   //Get width
   public double getWidth() 
   {
       return width;
   }    
} 
 class Rectangle extends shape
{
    //Calculate and return area of rectangle
    public double getArea()
    {
        return getHeight() * getWidth();
    }
}

 class Triangle extends shape
{ 
    //Calculate and return area of triangle
    public double getArea() 
    {
        return (getHeight() * getWidth()) / 2;
    }
} 


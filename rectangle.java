class rectangle

{
    
     double l,b;
  
     rectangle(double x ,double y)
 
    {
  
              this.l = x;
  
              this.b = y;

     }
 
    double calculate_area()

    {

         return (l*b);

    }

}

public class calculatearea

{

    public static void main(String args[])

    {
 
       rectangle rec = new rectangle(10,20);
      System.out.println("Area : " + rec.calculate_area());

 
    }
}
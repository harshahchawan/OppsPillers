import java.util.*;
class Rectangle extends Shape
{
    private float length,breadth;
     

     void acceptInput()
     {
    	 Scanner scan =new Scanner(System.in);
      System.out.println("enter length of Rectangle in meters");
       length=scan.nextFloat();
       System.out.println("enter breadth of Rectangle in meters");
       breadth=scan.nextFloat();
      }
      void calculate()
      {
       System.out.println(area=length*breadth));
      }
}

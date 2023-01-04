 import java.util.*;
class Square extends Shape
{
	private float length;
	
	
	    void acceptInput()
	    {
	    	Scanner scan =new Scanner(System.in);
		System.out.println("enter length of squre in meters");
		length=scan.nextFloat();
	    }
        void calculate()
        {
    	System.out.println(area=length*length);
        }
}

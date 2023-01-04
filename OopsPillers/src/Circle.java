import java.util.Scanner;

class Circle extends Shape
{

	private float radius;
	Scanner scan =new Scanner(System.in);
	
	    void acceptInput()
	    {
	    Scanner scan =new Scanner(System.in);
		System.out.println("enter radius of circle");
		radius=scan.nextFloat();
	    }
        void calculate()
        {
    	System.out.println(area= 3.14f*radius*radius);
        }
	


}

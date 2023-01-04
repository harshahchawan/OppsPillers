abstract class Shape
{
  protected float area;
  abstract void acceptInput();
  abstract void calculate();
  void disp()
  {
	  System.out.println(area);
  }
  
}

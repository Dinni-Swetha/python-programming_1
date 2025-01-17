class multitrydemo
{
  public static void main(String args[])
  {
  	try
  	{
      int a=10,b=5;
      int c=a/b;
      int d[]={0,1};
      System.out.println(d[10]);
      System.out.println(c);
  	}
  	catch(ArithmeticException)
  	{
  		System.out.println(e);
  	}
  	catch(ArrayIndexOutOfBoundsException)
  	{
  		System.out.println(e);
  	}
  	System.out.println("After catch statement");
  }
}
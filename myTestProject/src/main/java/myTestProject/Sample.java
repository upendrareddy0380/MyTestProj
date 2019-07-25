package myTestProject;

public class Sample 
{
    int a,b;
	public void add()
    {
    	System.out.println(a+b);
    }
	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.a=5;
		s.b=20;
		s.add();

	}

}

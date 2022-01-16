public class HelloWorld
{  
    public static void main(String args[])
    {  
     System.out.println("Hello World"); 
     
     Riya r = new Riya(10,20);
     System.out.println(r.addition());
      
     Riya r1 = new Riya(10,20,50);
     System.out.println(r1.addition1());
     
     Riya cal=new Riya(20);
     cal.printA();
    }
}

class Riya
{
int a;
int b;
int c;

Riya(int a)
{
	this.a=a;
}
Riya(int xx,int yy)
{
	a= xx;
	b =yy;
	
}
	public int addition()
	{
		int sum = a+b;
		return sum;
	}

	Riya(int aa,int bb,int cc)

{
	a= aa;
	b= bb;
	c= cc;
}
void printA()
{
	System.out.println("value " +a);
}
public int addition1()
{
	int sum = a+b-c;
	return sum;
}

}  

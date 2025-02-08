class A
{
  public void f1(int x)
  { System.out.println("class A"); }
}

class B extends A
{
   public void f1(int x)
  { System.out.println("class B"); }
	
}

public class Example
{
public static void main(String [] args)
{
 A objA=new A();
 B objB=new B();

 objA.f1(3);
 objB.f1(3);
}

}
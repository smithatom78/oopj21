package module2;
class ss1
{
int data=50;
	void say()
	{ System.out.println("Base Say\n -Data in S1="+data);
	}
}
class ss2 extends ss1
{int data=100;
	void say()
		{  super.say();
		//System.out.println("Derived---\nDisplay S1 Data in S2="+super.data);
	 // System.out.println("Derived---\nDisplay S1 Data in S2="+data);
		System.out.println("Derived---Data in S2="+data);
		
	}
}
public class SuperEx
{
	public static void main(String args[])
	{
	//s1 ob=new s2();
	ss2 ob=new ss2();
	ob.say();
	//ss1 ob1=new ss1();
	//ob1.say();
	
	}
}

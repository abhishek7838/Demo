package setExample;

import java.util.LinkedList;

public class ClassB 
{
	void meth1()
	{
		LinkedList  ll=new LinkedList(int 100);
		ll.add(34);
		ll.add(83);
		ll.add("java");
		System.out.println(ll);
		ll.add(83);
		ll.remove((Object)34);
		System.out.println(ll);
	}

	public static void main(String[] args)
	{
		ClassB b=new ClassB();
				b.meth1();
		

	}

}

package labCollectionExample;

import java.util.Vector;

public class ClassA 
{
	void meth1()
	{
		System.out.println("implementing vector method checking");
		Vector<Object> v=new Vector<Object>();
		v.addElement(34);
		v.add(40);
		v.addElement("java");
		v.add(40);
		v.add(null);
		v.addElement(null);
		v.add(47);
		System.out.println(v.size());
		System.out.println(v);
		System.out.println();
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		v.removeElementAt(3);
		System.out.println(v);
	}

	public static void main(String[] args)
	{
		ClassA a=new ClassA();
		a.meth1();
		

	}

}

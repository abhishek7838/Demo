package class4pm;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExa 
{
	void meth1()
	{
		ArrayList<Object> ts=new ArrayList<Object>();
		ts.add(new ClassA("abhi",101));
		ts.add(new ClassA("abh",012));
		System.out.println(ts);
	}
	public static void main(String[] args)
	{
		TreeSetExa t=new TreeSetExa();
		t.meth1();
	}

}

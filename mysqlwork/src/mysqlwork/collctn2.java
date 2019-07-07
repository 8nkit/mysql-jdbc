package mysqlwork;

import java.util.LinkedList;

public class collctn2 {

	public static void main(String...strings)
	{
		LinkedList l=new LinkedList();
		l.add("ankit");
		l.add(30);
		l.add(null);
		l.add("ankit");
		l.set(0,"softwares");
		l.add(0,"drone");
		l.removeLast();
		l.removeFirst();
		l.addFirst("Wee");
		System.out.println(l);
		
		
		
	}
}

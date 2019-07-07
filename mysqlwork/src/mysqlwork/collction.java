package mysqlwork;

import java.util.ArrayList;

public class collction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("A");
		a.add("");
		a.add(12);
		a.add("Ankit");
		a.add(null);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(2,"M");
		a.add("N");
		System.out.println(a);

	}

}

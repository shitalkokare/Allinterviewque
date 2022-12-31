package Tutorial;

import java.util.LinkedHashSet;

public class RemoveDubChar {

	public static void main(String[] args) {
		String a = "sainath Gaike";
		char[] abc = a.toCharArray();
		LinkedHashSet hs = new LinkedHashSet();
		for (Object o : abc) 
		{
		hs.add(o);
		System.out.println(o);
		}
		for (Object xyz : hs) {
		System.out.print(xyz);
		}


	}

}

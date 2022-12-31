package Tutorial;

public class Revstrsplit {

	public static void main(String[] args) {
		
		String abc="shital mohan kokare";
		String b[]=abc.split(" ");
		String c="";
		for(int i=b.length-1;i>=0;i--)
		{
			for(int j=0;j<b[i].length();j++)
			{
				c=b[i].charAt(j)+c;
				
			}
			c=" "+c;
		}
		System.out.println(c);
		
		
		
		
	}

}

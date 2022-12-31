package Practice;

public class Demo2 {

	//find unique element from given array
	public static void findUnique(int []a)
	 {
	 for(int i=0;i<a.length;i++)//10 ,4
	 {
	 boolean isUnique=false;
	 for(int j=0;j<i;j++)
	 {
//		 System.out.println(a[i]);//4, 4,4,5,5,5,10,3,3,3,3,3
//		 System.out.println("=======================");
//		 System.out.println(a[j]);//10,10,4,10,,4,10,10,4,4,5, 10
	
	if(a[i]==a[j])
	 {
	 isUnique=true;
	 break;
	 }
	 }
	 
	 if(!isUnique)
	 {
	System.out.println(a[i]+" ");//10,4
	 }
	 }
	 }
	public static void main(String[] args) {
		int a[]={10,4,4,5,10,3};
		findUnique(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

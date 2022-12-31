package Tutorial;

public class thrirdmaxno {

	
		public static void main(String[] args) 
		{
		int []a={10,5,8,11,03,7};
		 int temp;
		 for(int i=0;i<a.length;i++)
		 {
		 for(int j=1+i;j<a.length;j++)//10,5,8,11,3,7  ==  10>5
		 {
		 if(a[i]>a[j])
		 {
		 temp=a[i];//10
		 a[i]=a[j];//5
		 a[j]=temp;//10
		 }
		 }
		}
		 System.out.println("3rd max is: "+a[a.length-2]);
		 
	}
	

}

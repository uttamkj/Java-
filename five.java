import java.util.*;
class five{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int fact=1;
		double sum=1,power;
		for(int i=1;i<=n;i++){
			fact=1;
			for(int j=1;j<=i;j++)
			{
				fact*=j;
			}
			power=Math.pow(x,i);
			sum+=(double)power/fact;
			
		}
		System.out.println("Sum: "+sum);
	}
}
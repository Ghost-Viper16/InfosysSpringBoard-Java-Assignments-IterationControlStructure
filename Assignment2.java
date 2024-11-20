import java.util.Scanner;
class Assignment2 {
	public static void main(String[] args) {
		// Implement your code here 
		int  r = 0;
		System.out.println("Enter a number to find which is divisible by sum of its digits: ");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int t = a;
		while(t != 0)
		{
		    int s = t % 10;
		    r = r + s ;
		    t= t/10;
		}
		if(a%r == 0)
		{
		    System.out.println(a+" is divisible by sum of its digits");
		}
		else
		{
		    System.out.println(a+" is not divisible by sum of its digits");

		}
	}
}

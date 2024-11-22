import java.util.Scanner;
class Armstrong {
	public static void main(String[] args) {
		// Implement your code here
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter to find the Armstrong of that number:");
		int a = sc.nextInt();
		int t = a;
		int r = 0;
		while(t != 0)
		{
		    int s = t % 10;
		    r = r + s*s*s ;
		    t= t/10;
		}
		if(a == r)
		{
		    System.out.println(a+"  is an armstrong number");
		}
		else
		{
		    System.out.println(a+"  is not an armstrong number");

		}
	}
}
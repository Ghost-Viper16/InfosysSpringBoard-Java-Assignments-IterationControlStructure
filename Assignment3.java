import java.util.Scanner;
class Assignment3 {
	public static void main(String[] args) {
		// Implement your code here 
		//int b = 738 ;
		//int a = 123 ;
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
		System.out.println("Enter second to check first number is seed number of this: ");
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    int t = a ;
		int r = a;
		while(t != 0)
		{
		    int s = t % 10;
		    r = r * s ;
		    t= t/10;
		}
		if(r == b)
		{
		    System.out.println(a+" is seed of "+ r);
		}
		else
		{
		    System.out.println(a+" is not seed of "+ r);
		}
	}
}

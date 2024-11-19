import java.util.Scanner;
class Palindrome {
	public static void main(String[] args) {
		// Implement your code here 
		Scanner sc = new Scanner(System.in);
		System.out.println("Entyer a number to find the palindrome : ");
		int number = sc.nextInt();
		int temp = number , r=0,t=0;
		while(temp!=0)
		{
		    t = temp%10;
		    r = r*10+t;
		    temp = temp/10;
		}
		if(number == r)
		{
		    System.out.println(r+" is a palindrome number");
		}
		else
		{
		    System.out.println(r+" is not a palindrome number");
		}
	}
}


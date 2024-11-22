import java.util.Sacnner;
class LuckyNumber
{
	public static void main(String[] args) {
		// Implement your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check it is lucky number or not : ");
		int a = sc.nextInt();
		int t = a;
		String str = Integer.toString(a);
		int length = str.length();
		int r = 0;
		int position = 1;
		for(int i = 1 ; i<=length; i++)
		{
		    if(length%2 == 1)
		    {
		        int digit = t % 10;
		        if(position % 2 == 0)
		        {
		            r = r + digit * digit;
		        }
		        t= t/10;
		        position++;
		    }
		    if(length%2 == 0)
		    {
		        int digit = t % 10;
		        if(position % 2 == 1)
		        {
		            r = r + digit * digit;
		        }
		        t= t/10;
		        position++;
		    }
		    
		}
		if(r % 9 == 0)
		{
		    System.out.println("The number "+ a +" is a lucky number");
		}
		else
		{
		    System.out.println("The number "+ a +" is not a lucky number");
		}
	}
}

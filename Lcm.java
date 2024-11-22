import java.util.Scanner;
class Lcm {
	public static void main(String[] args) {
		// Implement your code here 
		 Scanner scanner = new Scanner(System.in);

      		// Input two whole numbers
        	System.out.print("Enter the first number: ");
        	int num1 = scanner.nextInt();

        	System.out.print("Enter the second number: ");
       	 	int num2 = scanner.nextInt();

	     	int n = 0;
		 if (num1 <= 0 || num2 <= 0) {
            		System.out.println("Please enter positive whole numbers.");
           		 return;
        		}
        int lcm = Math.max(num1, num2);
        
        while (lcm != n) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                n = lcm;
                System.out.println(n);
                n++;
            }
            lcm++;
        }
    }

	
}


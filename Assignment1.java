import java.util.Scanner;
class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of heads");
        int heads = sc.nextInt();
        System.out.println("Enter the number of legs");
        int legs = sc.nextInt();
        if(legs >= 2*heads && legs%2==0)
        {
            for( int x= 0 ; x<heads ; x++)
            {
                int y = heads - x;
                if(2*x + 4*y == legs)
                {
                    System.out.println("chicken: "+ x + "\n Rabbit "+ y);
                }
            }
        }
        else
        {
            System.out.println("Invalid value provided of heads " +heads +" and legs "+ legs);
        }
    }
}
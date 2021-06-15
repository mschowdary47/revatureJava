import java.util.Scanner;
public class Assessment 
{
    public static void main(String[] args) 
    {
        int a, b, choose, sum, sub, mul,div,mod;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        a = s.nextInt();
        System.out.print("Enter 2nd number:");
        b = s.nextInt();
        while(true)
        {
            System.out.println("Enter 1 for sum");
            System.out.println("Enter 2 for sub");
            System.out.println("Enter 3 for mul");
            System.out.println("Enter 4 for div");
            System.out.println("Enter 5 for mod");
            System.out.println("Enter 6 to Exit");
            choose = s.nextInt();
            switch(choose)
            {
                case 1:
                sum = a + b;
                System.out.println("Result:"+sum);
                break;
 
                case 2:
                sub = a - b;
                System.out.println("Result:"+sub);
                break;
 
                case 3:
                mul = a * b;
                System.out.println("Result:"+mul);
                break;
 
                case 4:
                div = a / b;
                System.out.println("Result:"+div);
                break;
                
                case 5:
                mod = a % b;
                System.out.println("Result:"+mod);
                break;
 
                case 6:
                System.exit(0);
            }
        }
    }
}
import java.util.*;

//Simple calculator

public class Calculator extends Math_Operations
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first element:");
        long a=sc.nextLong();
        System.out.println("Enter the second element:");
        long b=sc.nextLong();
        Math_Operations calc=new Math_Operations();
        System.out.println("Enter your Operation:");
        System.out.println("1.Add \n2.Sub \n3.Mul \n4.Div \n");
        int m = sc.nextInt();
         if(m==1) {
        	    System.out.println("Addition operation performed:");
                System.out.println("\n"+a+"+"+b+"="+calc.addition(a,b));
         }
         else if(m==2) {
        	    System.out.println("Subtraction operation performed:");
                System.out.println("\n"+a+"-"+b+"="+calc.subtraction(a,b));
         }
         else if(m==3) {
        	    System.out.println("Multiplication operation performed:");
                System.out.println("\n"+a+"*"+b+"="+calc.multiply(a,b));
         }
         else if(m==4) {
        	    System.out.println("Division operation performed:");
                System.out.println("\n"+a+"/"+b+"="+calc.division(a,b));
         }
       
       }
}
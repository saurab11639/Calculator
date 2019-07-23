package main;
import java.util.*; 

public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(add( num1,num2));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;      
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
            default:
                System.out.println("Illigal Operation");


        }



    }
    public static int add(int a, int b)
    {
    	int res=a + b;
//        write your code here 
  
    		
    	
        return res;
    }
    public static int sub(int a, int b)
    {
    	int res=a-b;
//        write your code here
    
        			
        return res;
    }
    public static int mult(int a, int b)
    {
    	int res=a * b;
//      write your code here
    	 
        			
    	return res;
    }
    public static int div(int a, int b)
    {
    	int res=a / b;;
//      write your code here
   
        			
    	return res;
    }

}
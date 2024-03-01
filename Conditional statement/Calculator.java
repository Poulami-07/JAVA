import java.util.*;
public class Calculator {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : "); 
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : "); 
        int b = sc.nextInt();
        System.out.println("Choose the operator : \n + \n - \n * \n / \n %");
        System.out.print("Press : ");
        char operator = sc.next().charAt(0); //for taking char input

        switch(operator){
            case '+' : System.out.println("Addition : "+ a+b); 
                         break;
            case '-' : System.out.println("Substraction : "+ (a-b)); 
                         break;
            case '*' : System.out.println("Multiplication : " +(a*b));
                         break;
            case '/' : System.out.println("Divition : "+ a/b);
                         break;
            case '%' : System.out.println("Modulo : "+ a%b);
                         break;
            default : System.out.println("Invalid operator"); 
        }
        sc.close();
    }
    
}

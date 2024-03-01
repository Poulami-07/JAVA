import java.util.Scanner;

public class parameter {
    public static int Calsum(int a, int b){ //parameters or formal parameters
        int sum = a + b;
        return sum; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Calsum(a, b); //Arguments or actual parameters
        System.out.println("Sum is : " +sum);
        sc.close();
    }
    
}

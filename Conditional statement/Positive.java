import java.util.Scanner;
public class Positive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 0){
            System.out.println("The number is positive");
        }
        else if (a < 0){
            System.out.println("the number is negative");
        }
        else{
            System.out.println("The number is 0");
        }
    sc.close();
}
    
}

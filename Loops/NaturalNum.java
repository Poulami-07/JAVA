import java.util.*;
public class NaturalNum {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum += i;
            i++;
        }
       System.out.println("Sum of natural nums till "+n+" is : " +sum);
    }
}

import java.util.*;
public class Breakex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int a = sc.nextInt();

        do{
            if(a % 10 == 0){
                break;
            }
            System.out.println(a);
        }while(true);


    }
    
}

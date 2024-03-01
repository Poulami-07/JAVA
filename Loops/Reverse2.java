import java.util.*;
public class Reverse2 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);{
         
        int number = sc.nextInt();
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
        sc.close();
    }   
    }
}


   /*      while(num > 0){
            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num /= 10;
        }
        System.out.println();
    }    
}
*/
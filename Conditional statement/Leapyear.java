import java.util.Scanner;
public class Leapyear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && (year % 100 !=0 || year % 400== 0 )){
            System.out.println(year +" is a Leap year");
        }else{
            System.out.println(year +" is not a leap year");
        }
    sc.close();
    }
    
}

/* 
import java.util.*;
public class Leapyear{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();

        boolean x= (year % 4) ==0;
        boolean y= (year % 100) !=0;
        boolean z= ((year % 100==0) && (year % 400==0));

        if(x && (y || z)) {
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leapyear");
        }
    }
}
*/
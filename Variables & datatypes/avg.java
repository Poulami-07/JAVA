import java.util.*;
public class avg {
    public static void main (String args[]){
        Scanner s = new Scanner (System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        float average = (a+b+c)/3f;
        System.out.println("avg is :" +average );

    }
    
}

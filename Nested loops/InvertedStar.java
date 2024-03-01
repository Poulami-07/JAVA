/*
public class InvertedStar {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=5;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}
*/

public class InvertedStar {
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<= n-i+1;j++){ //star = n-i+1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
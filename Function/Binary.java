public class Binary {
   public static void binToDec(int binNum){
    int count = binNum;
    int deciNum = 0;
    int pow = 0;

    while(binNum > 0){
        int lastDigit = binNum % 10;
        deciNum = deciNum + (lastDigit * (int) Math.pow(2, pow));
        pow ++;
        binNum = binNum / 10;
    }
    System.out.println("The decimal number of " + count + " is " + deciNum);
   }
   public static void main(String args[]){
    binToDec(111);
   }
}

public class Star{
    public static void main(String args[]){
        int line,star;
        for(line = 1;line<11;line++){
            for(star = 1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
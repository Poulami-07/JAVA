public class Break {
    public static void main(String args[]){
        int i ;
        for(i=1;i<=10;i++){
            if(i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of the loop");
    }
    
}

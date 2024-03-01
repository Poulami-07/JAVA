public class Ifelse {
    public static void main (String args[]){
        int age =78;

        if(age >= 18) {
            System.out.println("adult");
        }
        
        else if((age > 11) && (age < 18)) {
            System.out.println("teen");
        }
        
        else{
            System.out.println("not adult");
        }
    }
}

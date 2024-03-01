public class Product {
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String args[]){
        int a = 20;
        int b = 10;
        int prod = multiply(a,b);
        System.out.println("The product is : " +prod);
        prod = multiply(56,10);
        System.out.println("The product is : " +prod);
    }
}   


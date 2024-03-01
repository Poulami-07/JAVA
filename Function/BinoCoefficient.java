public class BinoCoefficient {

    public static int fact(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static int bincoef(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nr = fact (n-r);
        int bincoef = fact_n /(fact_r *fact_nr);
        return bincoef;
    }
    public static void main (String args[]){
        System.out.println(bincoef(5,2));
    }
}

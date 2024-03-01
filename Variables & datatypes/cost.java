import java.util.*;

public class cost {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total_cost = (pencil + pen + eraser);
        System.out.println("Total cost is :" +total_cost );

        float gst_add = (total_cost * 0.18f);
        float withgst_cost = (gst_add + total_cost);

        System.out.println("Cost with gst is :" + withgst_cost);
    }
    
}

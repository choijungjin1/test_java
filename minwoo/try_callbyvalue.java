import java.util.HashMap;

public class try_callbyvalue {
    static int globalVaule = 20;
    public static void main(String[] args) {
        int localValue = 50 ;
        try_callbyvalue callbyvalue = new try_callbyvalue();

        System.out.println("before change " + localValue);
        localValue = callbyvalue.change(500);
        System.out.println("after change " + localValue);
        System.out.println("global " + globalVaule);
    }
    public int change(int data) {
        int retrunValue;
        retrunValue = data + 100;
        //HashMap<Integer,String> hmap= new HashMap<Integer,String>();
        return retrunValue;
    }
}
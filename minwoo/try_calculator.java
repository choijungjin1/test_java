import java.util.HashMap;
 class calculator{
    int a;
    int b;

    public calculator(int a,int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
       return a+b;
    }
    public int sub(){
        return a-b;
    }
    public int mul(){
        return a*b;
    }
    public int div(){
        return a/b;
    }
    public void result(){
        HashMap<Integer,String> hmap= new HashMap<Integer,String>();
        System.out.println("Enter : " + a+ " "+b);
        System.out.println("add :" + add());
        System.out.println("sub :" + sub());
        System.out.println("mul :" + mul());
        System.out.println("div :" + div());
    }
}
public class try_calculator {
    public static void main(String args[]) {
        calculator cal = new calculator(2,2);
        cal.result();
    }
}
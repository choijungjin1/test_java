public class try_overloading {
    public static void main(String args[]) {
        int x = 2;
        int y = 2;
        try_overloading rel = new try_overloading();
        rel.result(x,y);
    }

    public int add(int x,int y) {
        return x+y;
    }
    public int sub(int x,int y) {
        return x-y;
    }
    public int mul(int x,int y ) {
        return x*y;
    }
    public int div(int x,int y) {
        return x/y;
    }
    public void result(int x,int y) {
        System.out.println("Enter: " +x +" " + y);
        System.out.println("Addition      :"+add(x, y));
        System.out.println("Subtraction   :"+sub(x, y));
        System.out.println("Multiplication: "+mul(x, y));
        System.out.println("Division: "+div(x, y));

    }
}
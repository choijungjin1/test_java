public class DisplayOverloading {
    public void display(String c) {
        System.out.println("One parameter: "+c);
    }
    public void display(String c,int num) {
        System.out.println("Two paramaters Method: " +c+ "," +num);

    }
    public void display(int c) {
        System.out.println("One parameter: "+c);
    }
}
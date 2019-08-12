import java.util.Scanner;

public class try_if {
    public static void main(String args[]) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("User Age:");
        //int user = scanner.nextInt();
        int user = 15;
        if(user <19) {
            if(user>16&&user<19) {
                System.out.printf("You are 17 or 18");
            }
            else {
                System.out.printf("16 or younger");
            }
        }
        scanner.close();
    }
}

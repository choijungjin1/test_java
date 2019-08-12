import java.util.Scanner;
public class try_if{
    public static void main(String args[])throws java.io.IOException{
        //Scanner scan = new Scanner(System.in);
        System.out.printf("User Age : ");
        int user = 16;//scan.nextInt();
        if(user<19){
            if(user>16 && user<19){
                System.out.printf("you are 17 or 18");
            }else{
                System.out.printf("16 or younger");
            }
        }
        //scan.close();
    }
}
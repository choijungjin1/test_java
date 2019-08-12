import java.io.IOException;

public class try_for_number {
    public static void main(String args[]) throws IOException {
        int row,col;
        for(row=0; row<5; row++) {
            for(col=0; col<5; col++) {
                System.out.printf(row+5*col+1 + " ");
            }
            System.out.printf("\n");
        }
    }
}
import java.io.IOException;

public class try_for_forchar {
    public static void main(String args[]) throws IOException {
        int row,col;
        for(row=0; row<7; row++) {
            if(row==0 || row==6) {
                for(col=0; col<5; col++) {
                    System.out.printf("~ ");
                }
            }
            else {
                for(col=0; col<5; col++) {
                    if(col==0 || col==4) {
                        System.out.printf("!");
                    }
                    else {
                        System.out.printf(row+5*(col-1) + " ");
                    }
                }
            }
            System.out.printf("\n");
        }
    }
}
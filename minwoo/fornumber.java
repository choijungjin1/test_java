public class fornumber{
    public static void main(String args[]){
        int i =1;
        for(int row =0; row<5 ; row++){
            i=row+1;
            for(int col =0; col<5 ; col++){
                System.out.printf(i+" ");
                i+=5;
            }
            System.out.printf("\n");
        }
    }
}
public class forchar{
    public static void main(String args[]){
        for(int row =0; row<7 ; row++){
            if(row == 0 || row == 6){
                System.out.println("~ ~ ~ ~ ~");
            }else{
                System.out.printf("! ");
                for(int col =0; col<3 ; col++){
                    System.out.printf(row + 5 * col +" ");
                }
                System.out.println("! ");
            }
        }
    }
}
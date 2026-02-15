/*

Pattern 09


*      *
*    *
*  *
*
*  *
*    *
*      *

*/


public class _09Pattern {

    public static void main(String[] args) {
         int n = 5;
        for(int i = 0 ; i<n;i++){
            for(int j= 0;j<n;j++){

                if(j==0 || i>=0 && j == n-(i+1)) {

                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


         for(int i = 0 ; i<n;i++){
            for(int j= 0;j<n;j++){

                if(j==1 || j>=0 && i == n-(i+1)) {

                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

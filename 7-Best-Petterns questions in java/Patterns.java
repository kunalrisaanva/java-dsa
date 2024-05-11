import java.util.*;

public class Patterns {

    public static void main(String args[]){


        // first question ans -> 
        
        int n = 4;
        int m = 5;

        // // outer loop 

        //  for( int i = 1 ; i <= n ; i++ ){

        //     // inner loop 

        //     for(int j = 1; j <= m;  j++ ){
        //         System.out.print("*");
        //     }
            
        //     System.out.println();
        //  }


        // second question ans -> 
        

        // outer loop 

        // for( int i = 1; i<=n ; i++ ){

        //     // innter loop 

        //     for( int j = 1; j <=n; j++){
        //         // cell => (i,j)
        //         if(i == 1 || j == 1 || i == n || j == n ){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }

        //     System.out.println();
        // }
        


        // Third question ans -> 


        // outer loop 

        // for( int i = 1; i<=n ; i++ ){

        //     // inner loop 

        //     for( int j = 1; j <=i; j++){
        //        System.out.print("*");
        //     }

        //     System.out.println();
        // }

         
        // Fourth question ans -> 

        // outer loop 

        for( int i = n ; i>= 1 ; i-- ){

          // inner loop 

        for( int j = 1; j <=i; j++){
           System.out.print("*");
        }

         System.out.println();
      }

    }
    
}




//1 question:-  Patterns the pattern 

// -- solid Rectangle ->

// *****
// *****
// *****
// *****
 

//2 question:- print the pattern 
// -- Hollow Rectangle

// **********
// *        *
// *        *
// **********

// rows - outer loop 
// cols - inner loop

//3 question:- print the pattern 
// -- Half Pyramid

// *
// **
// ****
// *****

//4 question:- print the pattern 
// -- Inverted Half Pyramid

// *****
// ****
// ***
// **
// *
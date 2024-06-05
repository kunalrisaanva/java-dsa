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

        //     for( int i = n ; i>= 1 ; i-- ){

        //       // inner loop 

        //     for( int j = 1; j <=i; j++){
        //        System.out.print("*");
        //     }

        //      System.out.println();
        //   }



        // fifth question ans -> 
        
        // outer loop 

        // for(int i = 1 ; i <= n ; i++ ){

        //     // inner loop -> space print

        //     for(int j = 1 ; j <= n-i; j++ ){
        //         System.out.print(" ");
        //     }


        //     // inner loop -> start print

        //     for(int j = 1 ; j <= i ; j++ ){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // } 


        
        // sixth question ans ->     
        
        // int k = 5;
        
        // for(int i = 1 ; i <= k; i++){

        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j+" ");
        //     }

        //     System.out.println();

        // }

        
        // seventh question ans -> 
        
        // int k = 5;


        // // outer loop 
        
        // for( int i = 1; i <= k ; i ++){

        //     // inner loop 

        //     for(int j = 1; j <= k-i+1; j++ ){
        //         System.out.print(j);
        //     }

        //     System.out.println();
        // }

        

        // Eight question ans -> 
        

        // int k = 5;
        // int number = 1;

        // outer loop 
        
        // for( int i = 1; i <= k ; i ++){

        //     // inner loop 

        //     for(int j = 1; j <= i; j++ ){
        //         System.out.print(number + " ");
        //         number++; // number = number + 1
        //     }

        //     System.out.println();
        // }


        // ninth question ans -> 
        

        // int k = 5;

        // outer loop 

        // for(int i = 1; i <= k; i++){
            
            //inner loop 

        //     for(int j =1; j <= i; j++){
        //         int sum = i+j;
        //         if(sum % 2 == 0){ // even 
        //             System.out.print("1");
        //         }else{ // odd
        //             System.out.print("0");
        //         }

        //     }

        //     System.out.println();


        // }

        


        // tenth question ans -> 
        

        //    int a = 5;
       

        // upper half 

        //    for( int i = 1; i <=a ; i++){

        //     // 1 part

        //     for(int j = 1; j<=i ; j++){

        //         System.out.print("*");
        //     }

        //     // spaces 

        //     int space = 2 * (a-i);

        //     for(int j=1; j<= space ; j++){
        //         System.out.print(" ");
        //     }

          //     // 2nd part

         //     for(int j=1; j<=i; j++){
         //         System.out.print("*");
         //     }

        //     System.out.println();


          //    }

    // lower half


        // for( int i = a; i >=1 ; i--){

        //     // 1 part

        //     for(int j = 1; j<=i ; j++){

        //         System.out.print("*");
        //     }

        //     // spaces 

        //     int space = 2 * (a-i);

        //     for(int j=1; j<= space ; j++){
        //         System.out.print(" ");
        //     }

        //     // 2nd part

        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();


        //    }


    // Eleventh question ans ->
   
        // int c = 5;


        // for(int i = 1; i<=c ; i++){
            

        // //  spaces 

        //     for(int j = 1; j <= c-i; j++){
        //         System.out.print(" ");
        //     }

        //     // stars

        //     for(int j =1 ; j<= 5; j++){
        //         System.out.print("*");
        //     }

        // System.out.println();

        // }
        
        
       // Twelfth question ans ->


    //    int b = 5;

    //    for(int i=1 ; i<=b; i++){


        // spaces

        // for(int j=1 ; j<=b-i; j++){
        //     System.out.print(" ");
        // }

        // number --> print row no times

    //     for(int j = 1; j<=i; j++){
    //         System.out.print(i + " ");
    //     }


    //      System.out.println();
    //    }

    

    // Thirteen question ans ->


    int k = 5;


    for(int i = 1 ; i <= k ; i++){


        // spaces 

        for(int j = 1 ; j <=k-i ;j++){
            System.out.print(" ");
        }



        // 1st half numbers 

        for(int j=i; j>=1; j--){
            System.out.print(j);

        }


        //2nd half numbers


        for(int j=2 ; j<=i; j++){
            System.out.print(j);
        }


        System.out.println();
    }


    // Fourteen  question ans ->





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


//5 question:- print the pattern 
// -- Inverted Half Pyramid ( rotated by 180 deg )

//     *
//    **
//   ***
//  ****
// *****


//6 question:- print the pattern 
// 

// 1
// 12
// 123
// 1234
// 12345


//7 question:- print the pattern 
// -- Inverted Half Pyramid with number

// 12345
// 1234
// 123
// 12
// 1


//8 question:- print the pattern 
// --Floyd's Traiangle

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15



//9 question:- print the pattern 
// --0-1 Traingle

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1



//10 question:- print the pattern 
// Butterfly Pattern 


// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *



//11 question:- print the pattern 
// Solid Rhoombus

//       *****
//      *****
//     *****
//    *****
//   *****


//12 question:- print the pattern 
// Number Pyramid

// 1
// 22
// 333
// 4444
// 55555


//13 question:- print the pattern 
// Palindromic Pattern

//     1
//    212
//   32123
//  4321234
// 543212345



//14 question:- print the pattern 
// Daimond Pattern 


//       *
//      ***
//     *****
//    *******
//    *******
//     ***** 
//      *** 
//       *
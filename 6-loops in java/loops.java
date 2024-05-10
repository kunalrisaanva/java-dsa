import java.util.*;

public class loops {
    public static void main ( String args[] ){
        
        // for loop 
        // for(int counter = 0; counter < 2 ; counter = counter + 1){
        //     System.out.println("helo world");
        // }
        

        // test 
        // for(int i = 0; i < 11 ; i++){
        //     System.out.println(i);
        // }


        // while loop 

        // int i = 0; 

        // while (i < 2) {
        //     System.out.println("hello world");
        //     i++;
        // }


        // do while 
        // int i = 0;
        // do{
        //   System.out.println("hello world");
        //   i++;
        // } while (i < 3);
        
        // defference between while - do while  loops 

        // int i = 12;

        // while (i < 11) {
        //     System.out.println("hello ");
        // }

        // do{
        //     System.out.println("hello ");
        // }while( i < 11 );

        // question:- Print the sum of first n Natural numbers.
        // n = 4

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;

        // for(int i = 1 ; i <= n; i++){
        //     sum = sum + i;
        //     // System.out.println(sum);
        // }

        // System.out.println(sum);

        // question :- print the table of a number input by the user .

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for(int i = 1 ; i <= 10 ; i ++){
                System.out.println(n*i);
            }
    }
}



// syntex of for loop 

// for(initialisaion; Condition; updation){
//     // do something
// }


// avoid infanite loops  


// while loop syntex 


// while(Condition){
       // do  something 
//     // increament 
// }



// do while loop syntex 

// do {
     // do something
     // increament
// } while(Condition);


// do while loop will run atleast one time  
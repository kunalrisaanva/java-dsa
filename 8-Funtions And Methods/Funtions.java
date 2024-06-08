import java.util.*;

public class Funtions {

    // sum funtion

    // public static int calCulateSum( int a , int b ){
        

    //     return  a+b;

    // }

    // multiplication 

    // public static int calCulateSum( int a , int b) {

    //     return a*b;

    // }
    

    // factorial 

    public static void printFactorail(int n){

        // loop 

        if(n < 0) {
            System.out.println( "Invalid number");
            return;
        }

        int factorial = 1;


        System.out.println(factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();


        // int ans =  calCulateSum(a,b); // call function 

        // System.out.println( "sum of two numbers : " + ans );

        int n = sc.nextInt();
        printFactorail(n);
    }
        
}

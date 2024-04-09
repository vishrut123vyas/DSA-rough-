// import java.util.*;


// public class hw3 {
//     public static void main(String[] args) {
//         // int n=100;
//         // for (int i = 0; i <= n; i++) {
//         //     if(i%2==0){
//         //         System.out.println(i);
//         //     }
//         // 
//     Scanner sc= new Scanner(System.in);
//     int input;
//     do {
//         int marks=sc.nextInt();
//         if (marks>=90 && marks<=100) {
//             System.out.println("this is great");
//         } else if(marks>=60 &&marks<=89) {
//             System.out.println("this is good");
//          } else if (marks<=59 &&marks>=0){
//             System.out.println("this is average");
//         } else{
//             System.out.println("fail");
//         }
//         System.out.println("proceed? 1(yes) & 0(no)");
//         input=sc.nextInt();
//     } while (input==1);
    
    
    
    
    
    
    
    
    
//     }

//     }

import java.util.*;


public class markshw3 {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int input;


       do {
           int marks = sc.nextInt();
           if(marks >= 90 && marks <= 100) {
               System.out.println("This is Good");
           } else if(marks >= 60 && marks <= 89) {
               System.out.println("This is also Good");
           } else if(marks >= 0 && marks <= 59) {
               System.out.println("This is Good as well");
           } else {
               System.out.println("Invalid");
           }


           System.out.println("Want to continue ? (yes(1) or no(0))");
           input = sc.nextInt();
      
       } while(input == 1);
   }   
}

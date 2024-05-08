import java.util.Scanner;

// public class nction {
//    public static void printmyname (String name) {
//  System.out.println(name);
//  return;
//    }
   
   
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         String name= sc.next();
//         printmyname(name);
//     }
// }
public class function1{
  
  public static int calculatesum(int a ,int b) {
    return a*b;
  }
  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    System.out.println("product of two numbers is:"+calculatesum(a, b));
  }}

// public static void printfactorial(int n) {
  
//   if (n<0){
//     System.out.println("Sorry! Factorial does not exist for negative number");
//     return;
//   }
  
  
//   int factorial=1;
//   for (int i = n; i>=1; i--) {
//     factorial=factorial*i;
//   }
//   System.out.print(factorial);
// }
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   int n= sc.nextInt();
//   printfactorial(n);
// }


// }
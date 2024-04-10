import java.util.Scanner;

public class primenumberhw4 {
    public static void printprimenumber(int n) {
        if(n<2){
            System.out.println("The number is not a prime number");
        return;
        }
        for (int index = 2; index < n; index++) {
           if (n%index == 0) {
            
           
            System.out.println("not a prime number");
        return;
        }
        }
        System.out.println("is a prime number");
    }
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printprimenumber(n);

    }
}

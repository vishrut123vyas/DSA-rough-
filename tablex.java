import java.util.Scanner;

public class tablex {
    public static void printTable(int n,int j) {
        // int tab = 0;
        for (int i = 1; i <= j; i++) {
           
               int tab = n * i;
            
            System.out.println(n + " * " + i + " = " + tab);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first no");
        int n = sc.nextInt();
        System.out.print("enter seconf number");
        int j = sc.nextInt();
       printTable(n,j);
    }
}
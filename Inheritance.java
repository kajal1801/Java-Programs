import java.util.Scanner;

public class Inheritance{
    public int fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(--n);
    }

    public static void main(String args[]){
        Inheritance obj = new Inheritance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int k = obj.fact(n);
        System.out.println("Fact = "+k);
        sc.close();
    }
}
import java.util.Scanner;

public class Inherited extends Inheritance{
    public int sum(int n){
        int sum = 0;
        for(int i = 1; i <= n;i++){
            sum += fact(i);
        }
        return sum;
    }
    public static void main(String args[]){
        Inherited obj = new Inherited();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = obj.sum(n);
        System.out.println("Fact = "+sum);
        sc.close();
    }
}

import java.util.Scanner;

public class PascalsTriangle {

    public static int fact(int i){
        if(i==0)
            return 1;
        return i*fact(--i);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=n;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<=i;k++){
                System.out.print(" "+fact(i)/(fact(i-k)*fact(k)));
            }
            System.out.println();
        }
        sc.close();
    }
}

    // 1
    // 11
    // 121
    // 1331
    // 14641
    // 15101051
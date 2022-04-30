import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FindMissing {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int x1 = array[0];
        int x2 = 1;
        
        for(int i = 1;i<n-1;i++){
            x1 = x1 ^ array[i];
        }
        
        for(int i = 2;i<=n;i++){
            x2 = x2 ^ i;
        }
        
        return x1 ^ x2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            FindMissing sln = new FindMissing();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}
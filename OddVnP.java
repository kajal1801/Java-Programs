import java.util.*;

class Summ{
    private int n;
    private int arr[];
    private int sum_odd_values;
    private int sum_odd_places;

    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();

        arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
    }

    public void odd_values_sum(){
        sum_odd_values = 0;

        for(int i = 0;i < n;i++){
            sum_odd_values += (arr[i]%2!=0) ? arr[i] : 0;
        }
    }

    public void odd_places_sum(){
        sum_odd_places = 0;

        for(int i = 1;i < n;i+=2){
            sum_odd_places += arr[i];
        }
    }

    public void display(){
        System.out.println("Sum of all the odd values in the given array is: "+sum_odd_values);
        System.out.println("Sum of the values at the odd places in the given array is: "+sum_odd_places);
    }
}

public class OddVnP {
    public static void main(String[] args){
        Summ ob = new Summ();
        ob.input();
        ob.odd_values_sum();
        ob.odd_places_sum();
        ob.display();
    }
}
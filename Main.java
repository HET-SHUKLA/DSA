import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalInputs = Integer.parseInt(sc.nextLine());

        for (int i=0;i<totalInputs;i++) {
            int n = Integer.parseInt(sc.nextLine());
            // Array input
            // int[] arr = new int[n];
            // for (int j = 0; j < n; j++) {
            //     arr[j] = Integer.parseInt(sc.nextLine());
            // }
            // Call function
            print(n);
            System.out.println("-------------------------");
        }
        sc.close();
    }

    static void print(int n) {
        System.out.println(n);
    }
}
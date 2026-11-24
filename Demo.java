import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        
    } {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();   // read n

        int[] list = new int[n];   // declare array of size n

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();   // read each number
        }

        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.println(list[i]);
        }

        sc.close();
    }
}
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int a[] = new int[20];
        System.out.println("Enter the no of elements in the array:");
        int c = sc.nextInt();
        System.out.println("Enter the search element");
        int se = sc.nextInt();
        int i;
        for (i = 0; i < c; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < c; i++) {
            if (a[i] == se) {
                index = i;
                break;
            }

        }
        System.out.println("the search element" + se + "is in position" + index);
    }
}

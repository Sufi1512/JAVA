import java.util.Scanner;

public class whilechap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i = 1;
        System.out.println("Enter the number");
        num = sc.nextInt();

        while (i <=10) {
            System.out.printf(" %dx%d = %d\n ", num, i, num * i);
            i++;
        }
    }
}

import java.util.Scanner;

public class chap3practice {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = a.toLowerCase();
        System.out.print("Lowercase of String is: ");
        System.out.print(b);
    }
}

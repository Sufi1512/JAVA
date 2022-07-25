import java.util.Scanner;
public class C6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of physisc out of 100");
        int a = sc.nextInt();
        System.out.println("Enter the marks of Chemistry  out of 100");
        int b = sc.nextInt();
        System.out.println("Enter the marks of Mathematics out of 100");
        int c = sc.nextInt();
        //String d = sc.nextLine();

        int percent = (a+b+c)/3;
        System.out.println("The Percentage is: ");
        System.out.println(percent);


    }
}

import java.util.Scanner;

public class forchap5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = sc.nextInt();
        for (int i=1; i<num;i++)
            System.out.printf("The odd number is %d\n",(2*i+1));
    }
}

import java.util.Scanner;
public class if_ladder {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc= new Scanner(System.in);
        age = sc.nextInt();
        if (age<5)
        {
            System.out.println("you're a baby");
        }  else if (age<18) {
            System.out.println("Not Eligible for vote");
        } else if (age>18&& age<60) {
            System.out.println("Eligible for vote");


        } else if (age>=60) {
            System.out.println("you're senior-citizen");
        }
        else
            System.out.println("Enter a valid age!!");
    }
}

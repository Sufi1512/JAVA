import java.util.Scanner;

public class chap2practice {

    public static void main(String[] args) {
        // problem 1
       /* float a = 7/4f * 9/2f;
        System.out.println(a);

        //prob 2
        char grade = 'c';
        System.out.println("Encrypted grade is: ");
        grade = (char)(grade+ 8);
        System.out.println(grade);
        grade = (char)(grade - 8);
        System.out.println("The correct grade is: ");
        System.out.println(grade);


        // prob 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int a = sc.nextInt();
        System.out.println("Enter second num: ");
        int b = sc.nextInt();
        System.out.println("Enter third num: ");
        int c =sc.nextInt();
        if (a>b)
            System.out.println("First num is > then second");
        if (a>17 && b>17 && c>17)
            System.out.println("evryone is Eligible");
*/    //problem 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of initial velocity: ");
        float u= sc.nextFloat();
        System.out.println("Enter the final velocity: ");
        float v = sc.nextFloat();
        System.out.println("Enter the acceleration: ");
        float a= sc.nextFloat();
        System.out.println("Enter the value of Dispalcement: ");
        float s =sc.nextFloat();
         float result= (v*v-u*u)/(2*a*s);
        System.out.println("Time is: ");
        System.out.println(result);
        ;

    }
}

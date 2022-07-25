import java.util.Scanner;

public class p4q2 {
    public static void main(String[] args) {
        float income ,tax;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Income in Lac: ");

        income=sc.nextFloat();
        if (income<2.5) {
            System.out.println("You're not eligible any kind of tax");
            System.out.println("The tax on income is 0");
        } else if (income>=2.5&& income<5) {
            System.out.println("The tax imposed on your income is 5%");
            tax= (income*5)*1000f;
            System.out.printf("The tax on income is: %f "  , tax);


        } else if (income>=5&&income<10) {
            System.out.println("The tax imposed on your income is 20%");
            tax= (income*20)*1000;
            System.out.printf("The tax on income is: %f "  , +tax);

        } else if (income>=10) {
            System.out.println("The tax imposed on your income is 30%");
            tax=  income*30*1000.0f;
            System.out.printf("The tax on income is: %f "  , tax);

        }
    }
}

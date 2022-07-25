import java.util.Scanner;

public class swit {
    public static void main(String[] args) {
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter brother' name");
        name =sc.nextLine();
        switch (name)
        {   case "sultan":
            System.out.println("he is eldest brother");
            break; 
            case "Zeeshan":
                System.out.println("he is eldest brother");
            case "Sufiyan":
                System.out.println("The given name is mine");
                break;
            default:
                System.out.println("Enter valid name");

        }
}
}
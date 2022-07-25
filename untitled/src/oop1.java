class details{
    int roll;
    String name;
    int number;
    int sal;

    public void printdetails() {
        System.out.println("My name is " + name);
        System.out.println("My roll is " + roll);
        System.out.println("My number is " + number);
        System.out.println("My salary is " + sal);

    }

}
public class oop1{
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        details sufiyan = new details();// Instantiating a new details Object
        details abhay = new details();// Instantiating a new detials Object

// Setting Attributes for Sufiyan
        sufiyan.number = 812788;
        sufiyan.name = "Sufiyan";
        sufiyan.roll = 13;
        sufiyan.sal = 130000;

        // Setting Attributes for abhay
        abhay.number = 1234;
        abhay.name = "ABHAY CHANDRA";
        abhay.roll = 4;
        abhay.sal = 10;

        // Printing the Attributes
        sufiyan.printdetails();
        abhay.printdetails();


    }
}

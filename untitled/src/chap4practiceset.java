import java.util.Scanner;

public class chap4practiceset {
    public static void main(String[] args) {
        //Question 2
        Scanner sc = new Scanner(System.in);
        byte m1,m2,m3;
        float avrg;
        System.out.println("Enter your Physic marks");
        m1=sc.nextByte();

        System.out.println("Enter your Chemistry marks");
        m2= sc.nextByte();
        System.out.println("Enter your Mathematics marks");
        m3= sc.nextByte();
        avrg = (m1+m2+m3)/3.0f;
        if (avrg>=40 &&m1>=33 && m2>=33 &&m3>=33)
            System.out.println("Congratulations!! you have been promoted");
        else
            System.out.println("Sorry!! you have been not promoted");
        System.out.print("The overall Percentage is: ");
        System.out.println(avrg);


    }
}

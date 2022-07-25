import javax.swing.*;
import java.util.Scanner;

public class chap6practiceset {
    public static void main(String[] args) {
        // problem 1
        /*float[] marks = {11.7f, 99.3f, 91.44f, 10.79f, 3.14f};
        float sum = 0;
        for (float element : marks) {
            sum=sum+element;
        }
        System.out.println(sum);
        // problem 2
        float[] marks = {11.71f, 99.3f, 91.44f, 10.79f, 3.14f};
        float num = 3.14f;
        boolean numinarray=false;
        for (float el:marks){
            if (el==num){
                numinarray=true;
            }
        }if (numinarray){
            System.out.println("Number is present in array");
        }else {
            System.out.println("Number is not present in array");
        }
        // problem3
        float[] marks = {11.7f, 99.3f, 91.44f, 10.79f, 3.14f};
        float sum = 0;
        for (float element : marks) {
            sum=sum+element;
        }
        System.out.println("The average value is: "+ sum/ marks.length);
        //problem 4
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }*/
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = 0;
        for(int e: arr){
            if(e>max){
                max = e;
    }
        }
        System.out.println("The maximum value is " +max);
    }
}
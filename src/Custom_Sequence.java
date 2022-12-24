/*
 * Siyanda Mvunyiswa
 * Custom Sequence: This program shows a custom sequence that starts with 4 and 2, the next number is equal to the product of the previous 2 numbers
 */

import java.util.Scanner;

public class Custom_Sequence {
    public static void main(String[] args){
        System.out.println("Enter number of elements of the sequence to print (greater than 2): ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] myArray = new int[num];
        myArray[0] = 4;
        myArray[1] = 2;

        System.out.println("The first " + num + " elements are as follows: ");
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == 0){
                myArray[i] = ((myArray[i-1])*(myArray[i-2]))-4;
            }

            for(int j = 0; j <= i; j++) {
                System.out.print(myArray[j] + " ");
            }
            System.out.println();
        }
    }
}

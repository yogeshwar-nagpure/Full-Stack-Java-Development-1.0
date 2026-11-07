package arrayProgram;

import java.io.*;
import java.io.BufferedReader;

public class Arr1 {

    public static void main(String [] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the number of the rows in same: ");
        int rows =Integer.parseInt(br.readLine());
        System.out.print("Enter the number of the colums in same: ");
        int cols =Integer.parseInt(br.readLine());

        int arr[][]= new int[rows][cols];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("Enter the element at position ("+i+","+ j + "): ");

                arr[i][j]=Integer.parseInt(br.readLine());
            }
            System.out.println();
        }
        System.out.println("the element in the array are: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

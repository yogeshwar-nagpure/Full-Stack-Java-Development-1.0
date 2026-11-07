package arrayProgram;

import java.io.*;
import java.io.BufferedReader;
public class Arr2 {

    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the number of the row in same: ");
        int rows=Integer.parseInt(br.readLine());
        System.out.print("Enter the number of the columns in same: ");
        int cols=Integer.parseInt(br.readLine());
        System.out.print("Enter the number of the pages in same: ");
        int page=Integer.parseInt(br.readLine());

        int arr[][][]=new int[page][rows][cols];

        for(int k=0;k<page;k++)
        {
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    System.out.print("Enter the element at position(" + k +"," + i + "," + j + "): ");
                    arr[k][i][j]=Integer.parseInt(br.readLine());

                }
            }
        }

        System.out.println("the elements in the array are: ");
        for(int k=0;k<page;k++)
        {
            System.out.println("Page" + k + ": ");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    System.out.print(arr[k][i][j] + " ");

                }
                System.out.println();
            }
        }

    }
    
}

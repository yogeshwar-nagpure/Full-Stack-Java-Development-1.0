package arrayProgram;

import java.util.Scanner;

public class StringLinierSearch {

    public static void main(String [] args)
    {
        String [] names={"yogesh","vishal","rishi","kartik"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String Name :");

        String  searchElement = sc.nextLine();

        for(int i=0; i<names.length; i++)
        {
            if(names[i].equals(searchElement))
            {
                System.out.println("Element found at index: "+ i);
                return;

            }
        }
        System.out.println("Element not found");

    }
    
}

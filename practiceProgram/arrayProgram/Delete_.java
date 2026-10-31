package arrayProgram;
 import java.util.Arrays;
public class Delete_ {

    public static int[] remove(int []arr,int index)
    {

    if (arr == null || index < 0 || index >= arr.length)
    {
        return arr;
    }

    int []arr2 = new int [arr.length -1];

    for(int i=0 ,k=0 ;i<arr.length;i++)
    {
        if (i== index)
        {
            continue;
           
        }
         arr2 [k++]=arr[i];
    }
    return arr2;
    }
    public static void main(String [] args)
    {
    int arr [] = {23,45,12,34,56,24};
    int index = 3;

    arr = remove(arr, index);
        System.out.println(Arrays.toString(arr) );
    }
    
}

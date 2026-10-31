
import java.util.Scanner;
 
public class GreaterthenZeroElements1 {

       public static void main(String [] args){

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter size of array ");
            int size=sc.nextInt();
            int arr[];
            arr=new int[size];
            int cnt=0,scnt=0, ecnt=0;

            for (int i=0;i<size;i++){
                System.out.println("Enter the "+(i+1)+" element");
                arr[i]=sc.nextInt();
               

            }
            System.out.println("Greater than zero number");

            for(int a:arr){
                 if(a>0){
                    cnt++;
                    System.out.print(a+",");
                }else if(a<0){
                    scnt++;
                }else{
                    ecnt++;
                }
            }

             System.out.println("\n Number of greater than zero value "+cnt);
             System.out.println("Number of less than zero value "+scnt);
             System.out.println("Number of equal as zero value "+scnt);
   
       }
 
    
}

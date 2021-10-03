import java.util.Scanner;

public class q6ArrRev {
    /*
    Example1)
    C:\>java Sample 1 2 3
    O/P: Please enter 4 integer numbers

    Example2)
    C:\>java Sample 1 2 3 4
    O/P:
     The given array is :
     1 2
     3 4
     The reverse of the array is :
     4 3
     2 1

Two dimensional Array
     */
    public static void main(String[] args) {
        if (args.length == 4) {
            int[][] arr = new int[2][2];
            int x=0;
            for(int i=0; i<arr.length ; i++)
            {
                for(int j=0 ;j< arr[i].length ; j++)
                {
                    arr[i][j]=Integer.parseInt(args[x]);
                    x++;
                }
            }
            System.out.println("The given array is:");
            for(int i=0 ; i<arr.length ; i++)
            {
                for(int j=0 ; j<arr[i].length ; j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();

            }
            System.out.println("The reverse of array is:");
            for(int i=arr.length-1 ; i>=0 ; i--)
            {
                for(int j=arr[i].length-1 ; j>=0 ;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Only 4 arguments must be entered.");
        }
    }
}

import java.util.Scanner;

public class q2IntArray {
    public static void main(String[] args) {
        /*
        Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

        Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
         */
        int[] arr = {1,4,34,56,7};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean num = false;
        for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
                num=true;
                break;
            }
        }
        if(num==true){
            System.out.println(3);
        }
        else{
            System.out.println(-1);
        }
    }
}

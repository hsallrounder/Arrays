import java.util.Scanner;

public class q5only_1_4 {
    /*
    only14([1, 4, 1, 4]) → true
    only14([1, 4, 2, 4]) → false
    only14([1, 1]) → true
     */
    boolean arrcheck(int[] arr){
        for (int i = 0; i<arr.length ; i++) {
            if(arr[i]!=1 && arr[i]!=4){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        q5only_1_4 obj = new q5only_1_4();
        System.out.println(obj.arrcheck(arr));
    }
}

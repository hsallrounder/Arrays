import java.util.Scanner;
/*
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
 */
public class q4Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];
        for(int i=0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int lb=0;
        int ub=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==6){
                lb=i;
            }
            else if(arr[i]==7){
                ub=i;
            }
        }
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            if(i>=lb && i<=ub) {
                continue;
            }
                sum += arr[i];
        }
        System.out.println(sum);
    }
}

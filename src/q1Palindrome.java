import java.util.Scanner;

public class q1Palindrome {
    /*
    Example1)
    C:\>java Sample 110011
    O/P: 110011 is a palindrome

    Example2)
    C:\>java Sample 1234
    O/P: 1234 is not a palindrome
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int x = n1;
        int n2=0;
        while(x>0){
            n2 = n2*10 + x%10;
            x = x/10;
        }
        if(n1==n2){
            System.out.println(n1+ " is a palindrome");
        }
        else{
            System.out.println(n1+ " is not a palindrome");
        }
    }
}

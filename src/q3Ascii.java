public class q3Ascii {
    public static void main(String[] args) {
        int[] arr = {65,66,67,68,69};
        System.out.print((char)arr[0]);
        for(int i=1 ; i<arr.length ; i++){
            System.out.print(" "+(char)arr[i]);
        }
    }
}

public class day7 {


    public static int  maximumprofit(int [] arr) {
        int maxprofit=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int profit= arr[i]-arr[j];
                maxprofit=Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
       System.out.println(maximumprofit(arr));
    }
}
public class day5 {
    public static int   countsubseq(int index, int [] arr,int sum,int k) {
        if(index==arr.length){
            if(sum==k){
                return 1;
            }
            else{
            return 0;
        }
    }
        // take 
        sum+=arr[index];
      int left=  countsubseq(index+1, arr,sum,k);
 

      // bactrackingg
      sum-=arr[index];

       // not taking
       int right= countsubseq(index+1, arr, sum,k);
       return left+ right;
    }
    public static void main(String[] args) {
         int arr[]={3,1,2};
         int k=3;
        
      int result = countsubseq(0,arr,0,k);
      System.out.println(" count :" + result);
    }
}

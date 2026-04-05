public class Day2 {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        sort(arr);
        median(arr);

    }
    public static void sort(int [] arr)
{
    int n=arr.length;
    for(int i=0;i<n-1;i++){
    for(int j=i+1;j<n;j++){
    if(arr[i]>arr[j]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    }
   }

}

// finding Median of the array
    public static void median(int [] arr) {
        int N=arr.length;
        if(N%2==0){
        int ind1=(N-1)/2;
        int ind2= N/2;
        float ans=(arr[ind1]+arr[ind2])/2;
        System.out.println(ans);
    }
    else{
      
        System.out.println(arr[N/2]);
    }
}
}
public class day6quick {
    public static void quicksort(int [] arr, int low,int high) {
        if(low<high){
            int partitionindex=f(arr,low,high);
            quicksort(arr, low, partitionindex-1);
            quicksort(arr, partitionindex+1, high);
        }
        
    }


    public static int  f(int [] arr, int low,int high) {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while (arr[j]>pivot && j>=low+1) {
                j--;
            }
            if(i<j) 
                swap(arr,i,j);
        }
        swap(arr,low,j);
        return j;
    }

    public static void swap(int [] arr,int idx1,int idx2) {
      int temp=arr[idx1];
      arr[idx1]=arr[idx2];
      arr[idx2]=temp;
        
    }
    public static void main(String[] args) {
         int arr[]={1,2,3,5,4,6,7,5,7};
        int low=0;
        int high=arr.length-1;
        quicksort(arr,low,high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}

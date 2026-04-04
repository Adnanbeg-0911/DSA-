 public class DAY1 {
   
        // find max amd min element 

        // int evencount=0;
        //  int oddcount=0;
        

        // for(int i=0;i<number.length;i++)
        // {
        //     if(number[i]>max){
        //     max=number[i];
        //     }


        // }
        // System.out.println(max);

    // calculating sum of all  number in array

    // for(int i=0;i<number.length;i++){
    //     sum+=number[i];
    // }
    // System.out.println(sum);


    // counting even and odd

    // for(int i=0;i<number.length;i++){
    //     if(number[i]%2==0){
    //         evencount++;
    //     }
    //     else
    //     {
    //         oddcount++;
    //     }
    // }
    // System.out.println(evencount);
    // System.out.println(oddcount);


    //nreverse the array
    // 

//    int start=0, end= number.length-1;
//    while(start<end)
//     {
//         int temp=number[start];
//         number[start]=number[end];
//         number[end]=temp;
//         start++;
//         end--;
    
//     }

//     for(int i=0;i<number.length;i++){
//         System.out.print(number[i]+" ");
//     }



// print second largest

// int largest=Integer.MIN_VALUE;
// int seclargest=Integer.MIN_VALUE;
// for(int i=0;i<number.length;i++){
//     if(number[i]>largest){
//          seclargest=largest;
//         largest=number[i];
     
//     }
//     else if(number[i]>seclargest && number[i]!=largest)
//     {
//         seclargest=number[i];
//     }
// }
// System.out.println("largest no :"+ largest);
// System.out.println("sec largest no :"+ seclargest);
// }


// int ans= Integer.MIN_VALUE;
// for(int i=0;i<number.length;i++){
//    ans=Math.max(ans,number[i]);

// }

// System.out.println("smalest no: "+ ans);
// }

// rearrranging the elements

public  static void main(String[] args) {
        int arr[]={1,2,3,4,5};
    //    sort(arr);
    //    rearrange(arr);
        //   product(arr);
        rotate(arr);
}


// public static void sort(int [] arr)
// {
//     int n=arr.length;
//     for(int i=0;i<n-1;i++){
//     for(int j=i+1;j<n;j++){
//     if(arr[i]>arr[j]){
//         int temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     }
//    }

// }


// // rearrange 
// public static void rearrange(int [] arr) {
//     int n=arr.length;

// for(int i=0;i<n/2;i++){
//     System.out.print(arr[i]+" ");
// }
// for(int i=n-1;i>=n/2;i--){
//     System.out.print(arr[i]+ " ");
// }
// }



// public static void product(int[] arr) {
//     int p=1;
//     for(int i=0;i<arr.length;i++){
//           p*=arr[i];
//     }
//     System.out.println(" the product of the array is :"+ p);
// }




// rotate the array
public static void rotate(int [] arr) {
    
int n=arr.length;
int k=3;
for(int i=0;i<n;i++)
{
    int temp=arr[(i+k)% n];
    System.out.print(temp+" ");
}

 }
}

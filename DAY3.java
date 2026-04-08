// ques 1- find factorial using recursion

public class DAY3 {

     public static int fact(int n) {
        if(n==0){
            return 1;
        }
        return n* fact(n-1);
        
    }
    public static void main(String[] args) {
     int n=4;
     System.out.println(fact(n));
    }
}



// ques -2 - Reverse an Array Using Recursion

public class DAY3 {
    public static void swap(int [] arr ,int l,int r) {
        int start=l;
        int end=r;
        
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          
    }


    public static void reverse(int arr[],int l,int r) {
        if(l>=r){
            return ;
        }
        swap(arr, l, r);
        reverse(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2};
        int l=0;
        int r=arr.length-1;
        reverse(arr,l,r);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}



// ques=3 - check number is palindrome or not

public class DAY3 {
    public static boolean check(int i, String s) {
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!= s.charAt(s.length()-i-1)){
         return false;   
        }
        return check(i+1, s);
    }

    public static void main(String[] args) {
        String s="NAMAN";
        System.out.println(check(0,s));
        
    }
}



// ques -4  find the fibonacci no

public class DAY3 {
public static int  fib(int n) {
    if(n<=1){
        return n;
    }
    return fib(n-1) + fib(n-2);
}
    public static void main(String[] args) {
        int n=4;
        System.out.print(fib(n));
    }
}



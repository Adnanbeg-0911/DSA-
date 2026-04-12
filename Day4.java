import java.util.ArrayList;

public class Day4 {

     public static void printsubseq(int index,int []arr, ArrayList<Integer>list) {
        if(index==arr.length){
            System.out.println(list);
            return;
        }
        // take 
        list.add(arr[index]);
        printsubseq(index+1, arr, list);
 
       // not taking

       list.remove(list.size()-1);
       printsubseq(index+1, arr, list);
    }

    public static void main(String[] args) {
        int arr[]={3,1,2};
        ArrayList<Integer> list= new ArrayList<>();
        printsubseq(0,arr,list);
    }
}
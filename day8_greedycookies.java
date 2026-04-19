import java.util.Arrays;
public class day8_greedycookies {

    public static int satisfy(int G[],int S[]) {
         Arrays.sort(G);
         Arrays.sort(S);
         int m=S.length;
         int l=0,r=0;
         while (l<m) {
            if(G[r]<=S[l]){
              r=r+1;
            }
            l=l+1;
         }
         return r;
    }
    public static void main(String[] args) {
        int G[]={1,3,7,2};
        int S[]={1,2,3,8};
      System.out.println(satisfy(G,S));
       
       
    }
}



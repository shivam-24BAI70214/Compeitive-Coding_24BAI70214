import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int tot = 0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==1) 
            tot++;
        }
        int maxG=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<n;i++){
            int val=(a[i]==0)?1:-1;
            curr=Math.max(val,curr+val);
            maxG=Math.max(maxG,curr);
        }
        if(maxG<=0){
            System.out.println(n-1);
        } 
        else{
            System.out.println(tot+maxG);
        }
        sc.close();
    }
}

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long t=sc.nextLong();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l=0;
        long sum=0;
        int maxB=0;
        for(int r=0;r<n;r++){
            sum+=a[r];
            while(sum>t){
                sum-=a[l];
                l++;
            }
            maxB=Math.max(maxB,r-l+1);
        }
        System.out.println(maxB);
        sc.close();
    }
}

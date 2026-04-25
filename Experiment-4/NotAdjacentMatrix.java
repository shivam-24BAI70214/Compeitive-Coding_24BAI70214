import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==2){
                System.out.println(-1);
                continue;
            }
            int[] a=new int[n*n];
            int in=0;
            for(int i=1;i<=n*n;i+=2){
                a[in++]=i;
            }
            for(int i=2;i<=n*n;i+=2){
                a[in++]=i;
            }
            in=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(a[in++]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int m=sc.nextInt();
        if(Math.min(a, m)%2==1){
            System.out.println("Akshat");
        } 
        else{
            System.out.println("Malvika");
        }
        sc.close();
    }
}

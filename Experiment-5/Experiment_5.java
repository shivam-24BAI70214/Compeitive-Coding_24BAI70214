class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
       long mod=1000000007;
        long left=0;
        long right=(long) n * Math.min(a,b);
        long lcm=lcm(a,b);
        while(left<right){
            long mid=(left+right)/2;
            long count=mid/a+mid/b-mid/lcm;
            if(count<n){
                left=mid+1;
            } 
            else{
                right=mid;
            }
        }
        return (int) (left % mod);
    }
    private long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
    private long gcd(long a,long b){
        while (b != 0) {
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a; 
    }
}

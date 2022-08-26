public class countzero1 { 
    public static void main(String[] args) {
        int n = 00000;
        System.out.println(zero(n, 0));
    }
    static int zero(int n, int count){
        return helper(n , count);
    }
    static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, count+1);
        }
        return zero(n/10, count);
    }
}

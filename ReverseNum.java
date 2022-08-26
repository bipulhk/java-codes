public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(rev(1234));
        System.out.println(palindrome(12321321));
    }
    static int rev(int n){
        int digits = (int)(Math.log10(n))+1;
        // return digits;
        return helper(n , digits);

    }
    static int helper(int n, int dig){
        if(n < 1){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, dig-1)) + rev(n/10);
    }
    static boolean palindrome(int n){
        return n == rev(n);
    }
}

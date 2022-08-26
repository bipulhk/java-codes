
public class CountZero {
    public static void main(String[] args) {
        int n = 100000;
        System.out.println(zero(n, 0));
    }
    static int zero(int n, int count){
        if(n < 1){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            count++;
        }
        return zero(n/10, count);
    }
}

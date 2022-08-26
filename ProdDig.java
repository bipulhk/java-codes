
public interface ProdDig {
    public static void main(String[] args) {
        System.out.println(Sum(505));
    }
    static int Sum(int n){
        if(n ==0){
            return 1;
        }
        return n%10 * Sum(n/10);
    }
}

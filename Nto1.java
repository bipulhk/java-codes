public interface Nto1 {
    public static void main(String[] args) {
        n1(10);
    }
    static void n1(int n){
        if(n == 0){
            return;
        }
        n1(n-1);
        System.out.print(n + " ");
    }
}

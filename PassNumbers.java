public interface PassNumbers {
    public static void main(String[] args) {
        num(10);
    }
    static void num(int n){
        if(n < 1){
            return;
        }
        System.out.print(n + " ");
        num(--n);
    }
}

// import javax.print.event.PrintEvent;

public class Fibo {
    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static void fibPrint(long  n){
        long first = 0;
        long second = 1;
        while(first <= n){
            System.out.print(first + " ");
            long temp = first;
            first = first +second;
            second = temp;
        }
    }
    public static void main(String[] args) {
        // System.out.println(fibonacci(1));
        fibPrint(2083408234);
    }
}

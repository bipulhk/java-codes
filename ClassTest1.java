import java.util.*;


class ClassTest1{
    public static void main(String[] args) {
        // System.out.println(print(5));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        print(n);
        sc.close();
    }

    static void print(int n){
        if(n == 10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
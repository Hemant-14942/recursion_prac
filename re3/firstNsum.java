import java.util.*;
public class firstNsum {
    public static int sum(int n){
        if(n<=0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans =sum(n);
        System.out.println(ans);
    }
}

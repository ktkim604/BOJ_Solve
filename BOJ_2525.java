import java.util.Scanner;

public class BOJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        A = A*60;
        int sum = A + B + C;
        int H = sum/60;
        int M = sum%60; 

        if(H>=24){
            H = H-24;
        }

        System.out.println(H + " " + M);
        
    }
}

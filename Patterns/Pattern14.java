package Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int i = 5;
        solve(i);
    }
    public static void solve(int k) {
        for(int i = 1; i <= k; i++) {
            for(int j = 65; j < 65 + i; j++) {
                System.out.print((char) j +" ");
            }
            System.out.println();
        }
    }
}

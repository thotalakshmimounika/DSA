package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int  i = 4;
        solve(i);
    }
    public static void solve(int num) {
        for(int i = 1; i <= num; i++) {
            for(int j = i; j < num; j++) {
                System.out.print(" ");
            }
            int ascii = 65;
            for(int k = num - i; k < num; k++) {
                System.out.print( (char) ascii++);
            }
            --ascii;
            for(int l = 1; l < i; l++) {
                System.out.print( (char) --ascii);
            }
            System.out.println();
        }
    }
}

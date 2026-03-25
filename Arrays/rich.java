// LeetCode -1672 .
// Richest Customer Wealth.

import java.util.*;

public class rich {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0, res = 0;
        int n,m;

        System.out.println("Enter the value for n and m");
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] acc = new int[n][m];

        System.out.println("Enter the values for Integer Grid");
        for (int i = 0; i < acc.length; i++) {
            for (int j = 0; j < acc[i].length; j++) {
                acc[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < acc.length; i++) {

            for (int j = 0; j < acc[i].length; j++) {
                sum += acc[i][j];
            }

            res = Math.max(res, sum);
            sum = 0;
        }
        System.out.println(res);
        sc.close();
    }    
}
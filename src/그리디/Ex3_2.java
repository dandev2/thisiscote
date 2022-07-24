package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.sql.BatchUpdateException;
import java.util.Arrays;
import java.util.StringTokenizer;

// 큰 수의 법칙
public class Ex3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(arr);
        int fir = arr[n-1];
        int sec = arr[n-2];
        int sum = 0;

        while(true) {
            if(m == 0) {
                break;
            }
            for(int i=0; i<k; i++) {
                m -= 1;
                sum+=fir;
                if(m==0) {
                    break;
                }
            }
            sum += sec;
            m -= 1;
        }
        System.out.println("sum = " + sum);
    }
}
/*
5 8 3
2 4 5 4 6

5 7 2
3 4 3 4 3
 */

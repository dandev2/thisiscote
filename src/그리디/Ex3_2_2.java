package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 큰 수의 법칙
public class Ex3_2_2 {
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

        int firCount = (m/(k+1))*k+m%(k+1);
        sum+= (firCount * fir) + ((m-firCount) * sec);
        System.out.println("sum = " + sum);
    }
}

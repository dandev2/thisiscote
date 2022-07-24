package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1이 될 때까지
public class Ex3_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;

        if (n % k != 0) {
            n--;
            count++;
            System.out.println("AAAAAA");
            System.out.println("n = " + n);
            System.out.println("count = " + count);
            while (true) {
                if(n==1) {
                    break;
                }
                n = n/k;
                count++;
                System.out.println("BBBBBB");
                System.out.println("n = " + n);
                System.out.println("count = " + count);
            }
        }else {
            while (true) {
                if(n==1) {
                    break;
                }
                n = n/k;
                count++;
                System.out.println("CCCC");
                System.out.println("n = " + n);
                System.out.println("count = " + count);
            }
        }
        System.out.println(count);

    }
}
/*
25 5
 */
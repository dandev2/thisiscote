package 그리디;

// 거스름돈
public class Ex3_1 {
    public static void main(String[] args) {
        int n = 1200;
        int count = 0;
        int[] money = new int[4];
        money[0] = 500;
        money[1] = 100;
        money[2] = 50;
        money[3] = 10;

        for(int i=0; i<4; i++) {
            count+=n/money[i];
//            n = n - (n/money[i] * money[i]);
            n %= money[i];
        }
        System.out.println(count);
    }
}

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, absA, absB, u=0;
        System.out.println("Nhập số nguyên a");
        a = sc.nextInt();
        absA = Math.abs(a);
        System.out.println("Nhập số nguyên b");
        b = sc.nextInt();
        absB = Math.abs(b);

        if (a == 0 && b == 0){
            u = 0;
//            System.out.println("không có ước chung lớn nhất");
        }else if (a == 0 && b != 0){
            u = absB;
        }else if (a != 0 && b == 0){
            u = absA;
        }else if ( a < b){
            int c = b - a;
            for (int i = c; i >= 1; i--){
                if (c % i == 0){
                    u = i;
                    break;
                }
            }
        }if (u != 0)
            System.out.println(u);
        else
            System.out.println("không có ước chung lớn nhất");
    }
}

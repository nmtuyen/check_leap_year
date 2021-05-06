import java.util.Scanner;

public class Print_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, count = 0, n = 3;

        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        a = sc.nextInt();
        while (count <= a){
            boolean isPrime = true;
            for (int i = 2; i < n; i++ ){
                if (n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true){
                System.out.print(n+", ");
                count++;
            }
            n++;

            }
        }

    }



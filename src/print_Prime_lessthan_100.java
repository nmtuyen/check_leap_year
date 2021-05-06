import java.util.Scanner;

public class print_Prime_lessthan_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Nhập khoảng cần in số nguyên tố: ");
        a = scanner.nextInt();
        for (int i = 2; i < a; i++){
            boolean isPrime = true;
            for (int j = 2; j < i; j++ ){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }if (isPrime){
                System.out.print(i+", ");
            }
        }
    }
}

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần check");
        a = sc.nextInt();
        if (a < 2){
            System.out.println(a + " is not Prime");
        }else{
            boolean check = true;
            for (int i = 2; i < Math.sqrt(a); i++){
                if (a % i == 0){
                    check = false;
                    break;
                }

            }
            if (check){
                System.out.println(a + " is Prime");
            }else
                System.out.println(a + " is not Prime");
        }
    }
}

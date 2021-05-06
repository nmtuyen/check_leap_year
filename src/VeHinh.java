import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Vẽ tam giác xuôi");
        System.out.println("3. Vẽ tam giác ngược");
        int a;
        a = sc.nextInt();
        switch (a){
            case 1:
                for (int i = 0; i < 5; i++){
                    for (int j = 0; j < 15; j++){
                        System.out.print("* ");
                    }System.out.print("\n");
                }
            case 2:
                for (int i = 0; i < 10; i++){
                    for (int j = 0; j < i; j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
            case 3:
                for (int i = 8; i > 0; i--){
                    for (int j = 0; j < i; j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
        }
    }
}

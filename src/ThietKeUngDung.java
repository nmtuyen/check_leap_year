import java.util.Scanner;

public class ThietKeUngDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Vẽ hình tam giác");
        System.out.println("3. Vẽ hình vuông");
        int a;
        System.out.print("Nhập hình bạn muốn vẽ: ");
        a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                break;
            case 2:
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
        }
    }
}

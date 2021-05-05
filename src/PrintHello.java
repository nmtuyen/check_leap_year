import java.util.Scanner;

public class PrintHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Nhập tên bạn muốn chào: ");
        name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}

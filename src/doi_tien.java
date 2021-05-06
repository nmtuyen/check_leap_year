import java.util.Scanner;

public class doi_tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn đổi sang usd: ");
        int rate = 23000, usd, vnd;
        usd = scanner.nextInt();
        vnd = usd*rate;
        System.out.println(usd + "usd bằng " + vnd+ " vnd");
    }
}

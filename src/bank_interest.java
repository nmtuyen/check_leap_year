import java.util.Scanner;

public class bank_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sotiengui, sothanggui;
        float laisuatnam, tienlai;
        System.out.print("Nhập số tiền gửi: ");
        sotiengui = sc.nextInt();
        System.out.print("Nhập số tháng gửi: ");
        sothanggui = sc.nextInt();
        System.out.print("Nhập lãi xuất");
        laisuatnam = sc.nextFloat();
        tienlai = sotiengui * laisuatnam/12 * sothanggui;
        System.out.println(tienlai + " là tiền lãi của "+ sotiengui + " sau "+ sothanggui+ " thang ");
    }
}

import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {
        int a;
        System.out.println("Nhập năm muốn kiểm tra");
        Scanner year = new Scanner(System.in);
        a = year.nextInt();
        if (a % 4 != 0){
            System.out.println("Năm "+ a + " không phải năm nhuận");
        }else {
            if (a % 100 == 0 && a % 400 != 0 ){
                System.out.println("Năm "+ a + " không phải là năm nhuận");
            }else{
                System.out.println("Năm "+ a + " là năm nhuận");
            }
        }
    }
}

import java.util.Scanner;

public class CheckBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        float height;
        height = sc.nextFloat();
        System.out.print("Nhập cân nặng: ");
        float weight;
        weight = sc.nextFloat();
        float bmi = weight/(height*height);
        if (bmi < 18.5){
            System.out.println("underweight");
        }else if(bmi < 25){
            System.out.println("Normal");
        }else if (bmi < 30){
            System.out.println("Overweight");
        }else
            System.out.println("Obese");
    }
}

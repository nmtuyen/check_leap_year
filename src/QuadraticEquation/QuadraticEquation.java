package QuadraticEquation;

import java.util.Scanner;
import java.util.concurrent.Delayed;

public class QuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation obj1 = new QuadraticEquation();
        if (obj1.Delta() < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if (obj1.Delta() == 0){
            System.out.println("Phương trình có 1 nghiệm duy nhất: "+ obj1.x1());
        }else
            System.out.println("Phương trình có 2 nghiệm: x1 "+ obj1.x1()+ " x2: "+ obj1.x2());
    }
    int a, b, c;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = sc.nextInt();
        System.out.print("Nhập b: ");
        b = sc.nextInt();
        System.out.print("Nhập c: ");
        c = sc.nextInt();
    }
    QuadraticEquation(){
        this.input();
    }
    double Delta(){
        double delta;
        delta = b*b - 4*a*c;
        return delta;
    }
    double x1(){
        double x1;
        x1 = (-b - Math.sqrt(this.Delta()))/(2*a);
        return x1;
    }
    double x2(){
        double x2;
        x2 = (-b + Math.sqrt(this.Delta()))/(2*a);
        return x2;
    }
}


package Rectangle;

import java.util.Scanner;

class Rectangle {
     double width, height;
     Rectangle() {};
     Rectangle(double width, double height){
         this.width = width;
         this.height = height;
     }
     double getArea(){
         return this.width * this.height;
     }
     double getPerimeter(){
         return (this.width+this.height)*2;
     }
     String display(){
         return "Hình chữ nhật có chiều dài là: "+ width + " chiều rộng là: "+height;
     }

}
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double width = sc.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double height = sc.nextDouble();
        Rectangle obj1 = new Rectangle(width, height);
        System.out.println(obj1.display());
        System.out.println("Dien tich hinh chu nhat la: "+ obj1.getArea());
        System.out.println("Chu vi hinh chu nhat la: "+ obj1.getPerimeter());
    }
}

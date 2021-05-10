import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int choice, size = 0;
        do {
            menu();
            System.out.print("Nhập lệnh muốn thực hiện: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    size = inputSize();
                    inputArr(size, arr);
                    break;
                case 2:
                    displayArr(size, arr);
                    break;
                case 3:
                    size = inputSize();
                    inputArr(size, arr);
                    int max = FindMaxEvenNumber(size, arr);
                    if (max == 0){
                        System.out.println("Không có số chẵn trong mảng");
                    }else
                        System.out.println("Số chẵn lớn nhất trong mảng là: "+ max);
                    break;
                case 4:
                    size = inputSize();
                    inputArr(size, arr);
                    findEven(size, arr);
                    break;
                case 5:
                    size = inputSize();
                    inputArr(size, arr);
                    sumEven(size, arr);
                    break;
                case 6:
                    size = inputSize();
                    inputArr(size, arr);
                    add(size, arr);
                    break;
                case 7:
                case 8:
                    size = inputSize();
                    inputArr(size, arr);
                    reverseArray(size, arr);
                case 9:
                    size = inputSize();
                    inputArr(size, arr);
                    printPrime(size, arr);
                case 10:
                    size = inputSize();
                    inputArr(size, arr);
                    sort(size, arr);
                case 11:
                    System.exit(0);
            }

        }while ( choice >= 1 && choice <= 11);
        }
    static void menu(){
        System.out.println("\n=========Menu=========");
        System.out.println("1. Nhập mảng có kích thước N (0<N<100)");
        System.out.println("2. Hiển thị mảng vừa nhập");
        System.out.println("3. Tìm số chẵn lớn nhất trong mảng");
        System.out.println("4. Liệt kê danh sách các số chẵn trong mảng");
        System.out.println("5. Tính tổng các số chẵn trong mảng");
        System.out.println("6. Nhập vào giá trị và vị trí cần chèn của giá trị đó trong mảng, chèn giá trị đó vào mảng");
        System.out.println("7. Xoá tất cả các phần tử có giá trị bằng X (được nhập từ bàn phím) khỏi mảng");
        System.out.println("8. Đảo ngược mảng ban đầu");
        System.out.println("9. Hiển thị danh sách các số nguyên tố trong mảng");
        System.out.println("10. Sắp xếp mảng theo thứ tự giảm dần");
        System.out.println("11. Thoát");
    }
    static int inputSize(){
        int N;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước của mảng(0<N<100)");
            N = sc.nextInt();
        }while (N < 0 || N > 100);
        return N;
    }
    static void inputArr(int N, int... arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N phần tử của mảng");
        for (int i = 0; i < N; i++){
            System.out.println("Nhập phần tử thứ: "+ i);
            arr [i] = sc.nextInt();
        }
    }
    static void displayArr(int N, int... arr){
        System.out.print("Mảng là: ");
        for (int i = 0; i < N; i++){
            System.out.print(arr[i]+", ");
        }
    }
    static int FindMaxEvenNumber(int N, int... arr){
        int max = -1;
        for (int i = 0; i < N; i++){
            if (arr[i] % 2 == 0 && arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void findEven(int N, int... arr) {
        boolean check = false;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print("\n" + "Các số chẵn trong mảng là: " + arr[i]);
                check = true;
            }
        }
        if (!check) System.out.println("\n" + "không có số chẵn trong mảng");
    }
    static void sumEven(int N, int[] arr){
        int sum = 0;
        boolean check = false;
        for (int i = 0; i < N; i++){
            if (arr[i] % 2 == 0){
                sum += arr[i];
                check = true;
            }
        }
        if (!check){
            System.out.println("Không có số chẵn nào trong mảng");
        }else
            System.out.println("Tổng các số chẵn trong mảng là: "+ sum);
    }
    static void add(int N, int [] arr){
        Scanner sc = new Scanner(System.in);
        int index;
        System.out.println("Nhập vị trí muốn chèn: ");
        index = sc.nextInt();
        if (index < 0 || index > arr.length){
            System.out.println("Không thể chèn vào vị trí này do vị trí này không tồn tại trong mảng");
        }else{
            System.out.println("Nhập số cần chèn");
            int num = sc.nextInt();
            int [] array = new int[N+1];
            for (int i = 0;  i < arr.length; i++){
                if (i == index ){
                    array[i] = num;
                }else if (i < index ) array[i] = arr[i];
                else array[i] = arr[i-1];
            }
            System.out.print("Mảng sau khi chèn là: ");
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        }

    }
    static void reverseArray(int N, int [] arr) {
        for (int i = 0; i < N / 2; i++) {
            int x = arr[i];
            arr[i] = arr[N - 1 - i];
            arr[N - 1 - i] = x;
        }
        System.out.println("\ncac phan tu sau khi đảo ngược là:");
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i] + " , ");
        }
    }
    static void sort(int N, int [] arr) {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] < arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        System.out.println("\nmảng sau khi sắp xếp theo thứ tự giảm dần là:");
        for (int i = 0;i<N;i++){
            System.out.print(arr[i] + ",");
        }
    }
    static boolean checkPrime(int a) {
        if (a < 2){
            return false;
        }
        for (int i = 2; i < a; i++){
            if (a % i == 0){
                return false;
            }
        }return true;

    }
    static void printPrime(int N, int [] arr){
        System.out.println("Các số nguyên tố trong mảng là: ");
        for (int i = 0; i < N;i++ ){
            if (checkPrime(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }

}

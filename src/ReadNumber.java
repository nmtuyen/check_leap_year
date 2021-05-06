import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Nhập số bạn muốn đọc: ");
        number = sc.nextInt();
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("zero");break;
                case 1:
                    System.out.println("one");break;
                case 2:
                    System.out.println("two");break;
                case 3:
                    System.out.println("three");break;
                case 4:
                    System.out.println("four");break;
                case 5:
                    System.out.println("five");break;
                case 6:
                    System.out.println("six");break;
                case 7:
                    System.out.println("seven");break;
                case 8:
                    System.out.println("eight");break;
                case 9:
                    System.out.println("nine");break;

            }
        } else if (number < 20) {
            int number_of_units;
            number_of_units = number - 10;
            switch (number_of_units) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelfth");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;


            }
        }else if (number < 100 && number >= 20) {

                int tens, odd;
                String valuetens ="", valueodd = "";

                tens = number / 10;
                odd = number - tens * 10;
                switch (tens) {
                    case 2:
                        valuetens = "twenty";break;
                    case 3:
                        valuetens = "thirty";break;
                    case 4:
                        valuetens = "fourty";break;
                    case 5:
                        valuetens = "fifty";break;
                    case 6:
                        valuetens = "sixty";break;
                    case 7:
                        valuetens = "seventy";break;
                    case 8:
                        valuetens = "eighty";break;
                    case 9:
                        valuetens = "ninety";break;

                }
                switch (odd) {
                    case 1:
                        valueodd = "one";break;
                    case 2:
                        valueodd = "two";break;
                    case 3:
                        valueodd = "three";break;
                    case 4:
                        valueodd = "four";break;
                    case 5:
                        valueodd = "five";break;
                    case 6:
                        valueodd = "six";break;
                    case 7:
                        valueodd = "seven";break;
                    case 8:
                        valueodd = "eight";break;
                    case 9:
                        valueodd = "nine";break;
                }
                System.out.println(valuetens + valueodd);
            }
        }
    }


import java.util.Scanner;
public class Calculator {


    public static void starLine(){
        int star;
        for (star = 1; star <=20;  star++){
            System.out.print("*");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        char op;
        String r = "Result is : ";
        starLine();
        System.out.print("Enter any number  :");
        num1 = scan.nextInt();
        starLine();
        System.out.print("Enter operator : ");
        op = scan.next().charAt(0);
        starLine();
        System.out.print("Enter any number : ");
        num2 = scan.nextInt();
        starLine();


        switch (op){
            case '+':
                System.out.print(r+(num1+num2));
                     break;
                case '-':
                        System.out.print(r+(num1-num2));
                            break;

                    case '*':
                            System.out.print(r+(num1*num2));
                                 break;
                        case '/':
                                System.out.print(r+(num1/num2));
                                      break;

            default:
                System.out.println("Invalid Input");

        }

        System.out.println();
          starLine();


    }
}

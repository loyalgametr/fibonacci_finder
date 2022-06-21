import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int e1 = 1;
        int e2 = 1;
        int e3 = 0;

        int countTheOrder = 0;
        System.out.println("Which element do you want to see?: ");
        int last_element = scan.nextInt();

        for (int i = 0;i<last_element;i++ ){

            if (countTheOrder%3 == 0){
                e3 = e1 + e2;
            }
            else if (countTheOrder %3 == 1){
                e1 = e2 + e3;
            }
            else if (countTheOrder%3 == 2){
                e2 = e1+e3;
            }

            countTheOrder++;
        }

        if (countTheOrder%3 == 0){
            System.out.println("The "+last_element + " th number is " + e3);
        }
        else if (countTheOrder%3 == 1){
            System.out.println("The "+last_element + " th number is " + e1);
        }
        else if (countTheOrder%3 == 2){
            System.out.println("The "+last_element + " th number is " + e2);
        }

    }
}
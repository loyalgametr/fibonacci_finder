import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // assign variable to keep values
        int e1 = 1;
        int e2 = 1;
        int e3 = 0;

        // a variable to create and order of approach
        int countTheOrder = 0;
        // get input for to see which element the user want to see
        System.out.println("Which element do you want to see?: ");
        int last_element = scan.nextInt();

        // iteration for finding the last element of fibonacci series
        // start of iteration
        for (int i = 0;i<last_element;i++ ){
            // from now on it will be in an order like:
            // e1 e2 e3 e1 e2 e3 e1 e2 e3 ...
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
        }// end of iteration

        // display the desired element of fibonacci using order approach variable
        // determine which is the last element
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
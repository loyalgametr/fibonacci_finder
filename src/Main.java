import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;

        Scanner scan = new Scanner(System.in);
        // get the number of element
        System.out.println("Which element do you want to see? :");
        int lastElement = scan.nextInt();
        // define a variable to keep indexes
        int count = 1;

        while (count < lastElement){
            // there must be a condition because it will not be correct if there two work simultaneously
            if (count%2 == 1){
                a = a + b;
            } else if (count%2== 0) {
                b = a + b;
            }

            count++;
        }
        // display results as the last item which was found by using condition
        if (count%2 == 1){
            System.out.println(a);
        } else if (count%2 == 0) {
            System.out.println(b);
        }


    }
}

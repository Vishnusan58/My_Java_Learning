import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        int salary ;
        Scanner  input = new Scanner(System.in);
        System.out.println(" Enter your Salary ");
        salary = input.nextInt();

        if (salary > 2000) {
            salary =salary + 3000 ;}

            else {
                salary =salary + 100;

            }
        System.out.println( " The incremented salary is "  + salary);
        }


    }


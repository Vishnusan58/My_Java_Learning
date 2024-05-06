import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c ;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if (a > b) {
            System.out.println(" This is the big " + a);
        }
        else {
            System.out.println(" This is the less one " + c);
        }
    }
}
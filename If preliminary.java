import java.util.Scanner;

/**
 * qw
 */
public class qw {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("คนที่มาเรียน :");
        int x = scanner.nextInt();

        System.out.print("คนที่มาเรียน :");
        int x1 = scanner.nextInt();

        int e1;

        if (x == 1) {
            e1 = 500;
        } else if (x == 2) {
            e1 = 450;
        } else if (x == 3) {
            e1 = 400;
        } else if (x == 4) {
            e1 = 350;
        } else if (x == 5) {
            e1 = 300;
        } else {
            e1 = 250;
        }
        int sum = x * e1 * x1;
        System.out.println("นักเรียนต้องจ่ายทั้งหมด : " + sum + "  คนล่ะ" + sum / x);

        System.out.print("จ่ายเงินไป");
        int qwe = scanner.nextInt();

        int q = qwe - sum;
        System.out.println("เงินถอน :" + q);
    }
}

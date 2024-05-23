import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int interval = scanner.nextInt();

        if (interval > -15 && interval <= 12) {
            System.out.println("True");
        } else if (interval > 14 && interval < 17) {
            System.out.println("True");
        } else if (interval >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
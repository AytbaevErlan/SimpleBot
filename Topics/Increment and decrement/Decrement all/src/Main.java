import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();
        // put your code here

        first--;
        second--;
        third--;
        fourth--;

        System.out.println(first + " " + second + " " + third + " " + fourth);
    }
}
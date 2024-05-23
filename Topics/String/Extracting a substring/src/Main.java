import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String result = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println(result.substring(first,second + 1));

    }
}
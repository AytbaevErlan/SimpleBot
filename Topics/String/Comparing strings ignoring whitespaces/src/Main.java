import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine().replaceAll(" ", "");
        String second = scanner.nextLine().replaceAll(" ", "");
//        first.replaceAll(" ", "");
//        second.replaceAll(" ", "");

        boolean result = first.equals(second);

        System.out.println(result);
        // start coding here
    }
}
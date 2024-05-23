import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        int result = 1;

        for (int i = input1; i < input2; i++){
            result = result * i;
        }

        System.out.println(result);
    }
}
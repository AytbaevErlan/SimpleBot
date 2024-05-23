import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int divisable = scanner.nextInt();
        int result = 0;
        int count = 0;
        for (int i = first; i <= second; i++){
            if (i % divisable == 0){
                count++;
            }

        }

        System.out.println(count);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
//        System.out.println("amount: ");
        int amount = scanner.nextInt();
//        System.out.println("weekend?: ");
        boolean weekend = scanner.nextBoolean();
        boolean result = false;

        if(weekend && (amount >= 15 && amount <= 25 )){
            result = true;
        } else if(!weekend && (amount >= 10 && amount <=20)){
            result = true;
        }
        else{
            result = false;
        }

        System.out.println(result);
        // You can use scanner.nextBoolean() to read a boolean value
    }
}
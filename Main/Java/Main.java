public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.print("Buzz");
                }
                if (i % 5 == 0) {
                    System.out.print("Fizz");
                }
                System.out.println();
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

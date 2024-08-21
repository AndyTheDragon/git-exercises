public class Main {

    public static void main(String[] args) {

        int tal = 0;

        while(tal < 100){

            if (tal % 3 == 0 && tal % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (tal % 3 == 0){
                System.out.println("Fizz");
            }
            else if (tal % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(tal);
            }

            tal++;
        }
    }
}

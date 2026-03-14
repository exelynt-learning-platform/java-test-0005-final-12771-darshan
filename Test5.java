public class Test5{
    public static void main(String[] args) {

        int num = 1;   // starting number

        for (int i = 1; i <= 5; i++) {   // rows

            for (int j = 1; j <= i; j++) {   // numbers in each row
                System.out.print(num + " ");
                num++;   // increment number
            }

            System.out.println(); // move to next line
        }
    }
}

package Sample;

public class Test_ {
    public static void main(String[] args) {

        int num = 29;
        boolean str = false;
        for (int i = 1; i <= num / 2; i++) {
            // condition for nonprime number
            if (num % i == 0) {
                str = true;
                break;
            }
        }

        if (!str)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}



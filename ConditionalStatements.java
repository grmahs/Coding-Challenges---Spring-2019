import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ConditionalStatements {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        String s1 = "Weird";
        String s2 = "Not Weird";

        if (n < 1 || n > 100) {
            return;
        }

        if (n % 2 != 0 || (n >= 6 && n <= 20)) {
            System.out.println(s1);
        } else if (n > 20 || (n % 2 == 0 && (n >= 2 && n <= 5))) {
            System.out.println(s2);
        }
    }
}

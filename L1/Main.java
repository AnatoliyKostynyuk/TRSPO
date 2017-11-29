package Lab1;

import java.util.Scanner;

/**
 * Created by Nick Batist on 11/23/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Calc calc = new Calc(a, b);
        System.out.println(calc.plus());
        System.out.println(calc.minus());
        System.out.println(calc.multiply());
        System.out.println(calc.division());
    }
}

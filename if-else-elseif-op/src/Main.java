public class Main {
    public static void main(String[] args) {
        int x = 12;
        //{} are optional to use with if statements in Java, for one liners
        if (x == 12) {
            System.out.println(x);
        }

        int y = 12;
        if (y != 11) {
            System.out.println(y);
        }

        int z = 12;
        if (z == 11) {
            System.out.println(z);
        }

        int p = 12;
        if (p != 11) {
            System.out.println("p is not 12");
        }

        int r = 12;
        if (r != 11) {
            System.out.println("r is 12");
        } else {
            System.out.println("r is not 12");
        }

        int s = 12;
        if (s >= 1) {
            System.out.println("s is greater than or equal to 12");
        } else {
            System.out.println("s is smaller than 12");
        }

        int t = 12;
        if (t > 1) {
            System.out.println("t is greater than 1");
        } else {
            System.out.println("t is smaller than 1");
        }

        int q = 12;
        if (q < 1) {
            System.out.println("q is greater than 12");
        } else {
            System.out.println("q is smaller than 12");
        }

        System.out.println("if-else tests");


    /*single operand boolean is unary operation
     * statements involving two operands are binary operations e.g. a + b
     * ternary operators are shorthand of if-else in Java, and has 3 operands*/
        int o = 21;
        String ternaryResult = (o < 12)?"o is greater than 21":"o is smaller than 21";
            System.out.println(ternaryResult);

        int u = 7;
        int v = 50;
        if (u == 6) {
            System.out.println("bole jo koyal baagon mein");
        }
        else if (u > 6) {
            System.out.println("thala for a reason");
        }
        else {
            System.out.println("credit");
            if (v <= 2019) {
                System.out.println("definitely not");
            }
        }
    }
}
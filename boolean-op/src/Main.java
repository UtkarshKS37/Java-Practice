public class Main {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        //! is opposite
        System.out.println(!y);

        //&& AND operator is true only when both operands are true, otherwise false
        //|| OR operator is true if any one of the operands is true
        if (x && true) {
            System.out.println("the condition is true");
        }
        else {
            System.out.println("the condition is false");
        }

        if (y || false) {
            System.out.println("the condition is true");
        }
        else {
            System.out.println("the condition is false");
        }

        int a = 6;
        int b = 8;
        if ((a < b) && (b > 9)) {
            System.out.println("the condition is true");
        }
        else {
            System.out.println("the condition is false");
        }
        if ((a < b) || (b > 9)) {
            System.out.println("the condition is true");
        }
        else {
            System.out.println("the condition is false");
        }

        int boyAge = 6;
        int girlAge = 8;
        if ((boyAge >= 21) && (girlAge >= 18)) {
            System.out.println("eligible for marriage");
        }
        else {
            System.out.println("cbi, open up!");
        }
    }
}
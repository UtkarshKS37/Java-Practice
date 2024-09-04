public class Main {
    public static void main(String[] args) {
        int x = 6;
        /*The Java switch statement executes one statement from multiple conditions. It is like if-else-if ladder
        statement. The switch statement works with byte, short, int, long, enum types, String and some wrapper types
        like Byte, Short, Int, and Long. Since Java 7, you can use strings in the switch statement.In other words,
        the switch statement tests the equality of a variable against multiple values.
        In switch case, there is no condition checking, multiple runs will display multiple outputs, therefore,
        we apply breaks to break a statement.*/
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            case 3:
                System.out.println("x is 3");
                break;
            default:
                System.out.println("x isn't 1, 2 or 3");
                break;
        }


        int l = 12;
        switch (l) {
            case 4 -> System.out.println("l is 12");
            case 5 -> System.out.println("l is 21");
            default -> System.out.println("l isn't 12 or 21");
        }

        //these operations are case-sensitive
        char m = 'U';
        switch (Character.toLowerCase(m)) {
           case 'u' -> System.out.println("m is u");
           case 'v' -> System.out.println("m is v");
           default -> System.out.println("m isn't u or v");
        }


        String n = "V";
        switch (n.toLowerCase()) {
            case "u" -> System.out.println("n is u");
            case "v" -> System.out.println("n is v");
            default -> System.out.println("n isn't u or v");
        }
    }
}

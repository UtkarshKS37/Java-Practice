public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println("continue ka karishma");
            if (i == 4) {
                continue; //this skips the print of i in 4th iteration or simply when i=4
            }
            System.out.println(i);
        }
System.out.println("");
        int x = 4;
        while (x < 11) {
            System.out.println(x);
            if (x == 9) {
                break;
            }
            x++;
        }
    }
}
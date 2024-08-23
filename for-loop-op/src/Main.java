public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("o/p of i:" + i);
        }
System.out.println("");

        for (int j = 10; j >= 0; j--) {
            System.out.println("o/p of j:" + j);
        }
 System.out.println("");

        //int k = 13;
        for (int k = 0; k < 12; k = k+2) {
            System.out.println("o/p of k:" + k);
        }
        //System.out.println(k);
System.out.println("");

        for (int l = 0, m = 10; (l < 6) && (m > 4); l++, m++) {
            //m--; //m is being added twice now
            System.out.println("o/p of l & m:" + l + " & " + m);
        }
System.out.println("");

        for (int n = 0, o = 10; (n < 6) || (o > 2); n++, o--) {
            //j--; //j is being added twice now
            System.out.println("o/p of n & o:" + n + " & " + o); //not to write i + j directly together to concatenate, not add
        }

    }
}
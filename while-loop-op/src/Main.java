public class Main {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 7) {
            System.out.println("yo"+ x);
            x++;
        }

//        int i = 0, j = 21;
//        while (i < 5 && j > 20) {
//            i++;
//            j--;
//            System.out.println("o/p:" + i + " & " + j);
//        }

        int i = 0, j = 21;
        while (i < 5 || j > 25) {
            i++;
            j--;
            System.out.println("o/p:" + i + " & " + j);
//            i++;
//            j--;
        }
    }
}
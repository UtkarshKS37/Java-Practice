public class Main {
    public static void main(String[] args) {
        String word1 = "Oracle\u00A9 ";
        String word2 = "OpenJDK ";
        int word3 = 19;
        String word4 = "19";
        String word5 = "99";
        System.out.println(word1+word2+word3);
        System.out.println(Integer.parseInt(word4)+2);
        System.out.println(word4+word5);
        //as no type casting has been done so the string values are concatinated, not added
    }
}
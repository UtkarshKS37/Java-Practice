public class Main {
    public static void main(String[] args) {
        //(a+b)^2 = a^2 + b^2 + 2ab
        int a = 21;
        float b = 6.9f;
        //double ans = a*a + b*b + 2*(a*b);
        float ans = a*a + b*b + 2*(a*b);
        //int ans = (int)(a*a + b*b + 2*(a*b));
        System.out.println(ans);
    }
}
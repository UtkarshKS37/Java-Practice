public class Main {
    public static void main(String[] args) {
        int x = 123;
        int sum = 0;
        while (true) {
            System.out.println(x%10); //in this loop, this separates the modular dividend
            sum = sum + (x%10); //here, the dividend is added to the sum
            x = x/10; //here, after the dividend has completed it's the remaining part of initial x is divided by 10 which gives the next whole no. to reiterate the loop
            //this loop breaks the while loop which is true to execute for infinity, when the last dividend has been worked upon, leaving initial x's value as 0<1, hence breaking the loop
            if (x < 1) {
                break;
            }
        }
        System.out.println("sum of x:" + sum);
    }
}
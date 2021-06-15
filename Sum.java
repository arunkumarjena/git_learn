public class Sum{
    public int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        // int a = 5;
        // int b = 6;

        // System.out.println("Sum = " + (a+b));
        // Creating object for it
        Sum sum = new Sum();
        System.out.println("Sum is : " + sum.add(49,10));
    }
}
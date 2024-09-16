public class Main {
    private static Calculator  calculator = new Calculator();
    public  static void main(String[] args) {
        int a = 5;
        int b = 6;
        int sum = 0;
        sum = calculator.add(a,b);
        System.out.println(sum);
    }
}
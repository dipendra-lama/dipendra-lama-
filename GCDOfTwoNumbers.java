import java.util.Scanner;

class GCDOfTwoNumbers
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();
        
        int gcd = findGCD(n1, n2);
        
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
        
        scanner.close();
    }
    
    // Efficient Euclidean Algorithm method
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
import java.util.Scanner;
class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();
        
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        
        
        for (int i = start; i <= end; i++) {
            // 1 se chote numbers prime nahi hote
            if (i <= 1) {
                continue; 
            }
            
            boolean isPrime = true;
            
            // Number prime hai ya nahi check karne ke liye optimized loop 
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false; // Agar divide ho gaya to prime nahi hai
                    break;
                }
            }
            
            // Agar prime hai to print kiya 
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
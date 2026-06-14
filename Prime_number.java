/*prime number program*/
//input number 7----->jo khud se aur one se puri trah se divisial ho aur reminder zero deta hai  vhi prime number hota hai 
import java.util.Scanner;
class Prime_number{
   public static void main(String[] args) {
    int n,count = 0;
        System.out.print("Enter a number: ");
    Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
    for(int i = 1; i <= n; i++){
        if(n % i == 0){
            count++;
        }
    }
   if(count == 2){
     System.out.print("Prime number");
   }
   else
    System.out.print(" not Prime number");
}
}














/*reverse number of program*/
//input number ------> 123---->321
import java.util.Scanner;
class Reverse{
public static void main(String[] args){
    int n,r;
        System.out.print("enter any number");
        Scanner ref = new Scanner(System.in);
         n = ref.nextInt();
        while(n>0){
            r = n % 10;
             System.out.println("reverse order:" + r);
             n= n/10;
        }
  }
}
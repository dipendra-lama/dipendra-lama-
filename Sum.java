/* so of first natural number*/
//1+2+3+4+5+6+7+8+9+10 = 55 natural number
import java.util.Scanner;
class Sum{
    public static void main(String[] args){
        int n,sum = 0;
        System.out.print("enter any number");
        Scanner r = new Scanner(System.in);
         n = r.nextInt();
         for(int i = 1; i<=n; i++){
            sum = sum + i;
         }
         System.out.println("Addition" + sum);
    }
}










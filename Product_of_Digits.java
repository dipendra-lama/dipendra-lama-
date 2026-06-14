/* product of number*/
//input ----->243...2*4*3 = 24
import java.util.Scanner;
class Product_of_Digits{
public static void main(String[] args) {
        int n, pro = 1;
        System.out.print("Enter any number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        while(n>0){
            pro = pro*(n % 10);
            n = n /10;
        }
        System.out.print("Product of digit= " + pro);
}

}
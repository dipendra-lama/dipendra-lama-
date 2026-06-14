/*palindrome Number*/
//input number 121---->121
import java.util.Scanner;
public static void main(String[] args) {
        int n, s= 0, r, c;
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c=n;
        while(n>0){
            r = n % 10;
            s = (s * 10) + r;
            n = n/10;
        }
        if(c==s)
        System.out.print("Palindrome number ");
       else
        System.out.print(" Not Palindrome number ");
}



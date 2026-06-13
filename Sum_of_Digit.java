import java.util.Scanner;
/* sum of digut of programs*/
//input number 126----->(1+2+6 = 9)
class Sum_of_Digit{
    public static void main(String[] args){
        int n, r, Sum = 0;
    System.out.print("Enter any number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        while(n>0){
            r= n % 10;
            Sum= Sum +r;
            n = n/10;
        }
        System.out.print("Sum of Digits:" + Sum);

    }
}
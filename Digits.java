//input 3456----->4
import java.util.Scanner;
class Digits{
public static void main(String[] args){
    int n, count=0;
   System.out.println("enter any number"); 
   Scanner r = new Scanner(System.in);
   n = r.nextInt();
   while(n>0){
   n = n/10;
   count++;
   }
   System.out.println("No of Digits"+ count);
}
}
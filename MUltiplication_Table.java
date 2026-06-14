/* print multiplication table */
//input number 6
//6 * 1= 6;
//6 * 2 = 12;
import java.util.Scanner;
class MUtiplication_Table{
    public static void main (String[]args){
        int num;
        System.out.print("enter any number");
          Scanner r = new Scanner(System.in);
           num = r. nextInt();
           for(int i = 1; i <= 10; i++){
             System.out.print(num + "*"+ i +"=" + num * i);
           }
    }
}



















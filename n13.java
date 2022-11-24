import java.util.Scanner;
public class n13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
       double n,x;
        do {
            System.out.print("Введите число 1: ");
            x = new Scanner(System.in).nextDouble();
            System.out.print("Введите число 2: ");
            n = new Scanner(System.in).nextDouble();
          }  while ((-15 > n) &&  (n > 15));
            System.out.println("Число в степени - " + Math.pow(x, n));
        
}
}
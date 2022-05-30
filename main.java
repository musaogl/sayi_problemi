import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int n,topla=0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz :");
            n=input.nextInt();
            if(n%2==0&&n%4==0)
            {
               topla +=n;
            }
        } while (n%2==0);
        System.out.println("Sayıların Toplamı :"+topla);
    }
}

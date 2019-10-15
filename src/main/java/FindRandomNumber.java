import java.util.Random;
import java.util.Scanner;

public class FindRandomNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int[] A = new int[100];
        int name = r.nextInt(100);
        System.out.println("Let The Game Begin!");
        while(true){
            int n = in.nextInt();
            if(n>name) System.out.println("Your Number Is Too Big... Make It Smaller");
            else if(n<name) System.out.println("Your Number Is Too Small... Make It Bigger");
            else{
                System.out.println("Congratulations!!!");
                break;
            }
        }
    }
}

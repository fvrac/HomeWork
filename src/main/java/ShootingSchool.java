import java.util.Random;
import java.util.Scanner;

public class ShootingSchool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int rand1 = r.nextInt()%4;
        int rand2 = r.nextInt()%4;
        if(rand1<0){
            rand1=rand1*(-1);
        }
        if(rand2<0){
            rand2=rand2*(-1);
        }

        System.out.print(rand1+" "+rand2);
        System.out.println();
        System.out.println();

        char[][] A = new char[10][10];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j]='-';
            }
        }

        while (true){

            int l = 10;
            int c = 10;

            System.out.println("Choose Line(0-4) To Shoot: ");
            while (l>4){
                l = in.nextInt();
            }

            System.out.println("Choose Column(0-4) To Shoot: ");
            while (c>4){
                c = in.nextInt();
            }

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (l==rand1 && c==rand2) {
                        A[l][c] = 'x';
                    }
                    else A[l][c] = '*';
                }
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(A[i][j]);
                }
                System.out.println();
            }

            if (l==rand1 && c==rand2){
                break;
            }
        }
        System.out.println("You Have Won!");
    }
}

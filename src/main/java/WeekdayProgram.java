import java.util.Scanner;

public class WeekdayProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "sleep";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to university; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to university; watch an animation";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to university; read a book";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "go to university; play computer game";
        schedule[5][0] = "Friday";
        schedule[5][1] = "go to university; meet with friends";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "do homework";

        label:
        while (true){

            System.out.println("Please, input the day of the week:");

            String s = in.nextLine();
            s=s.toLowerCase();

            switch (s) {
                case "change monday":
                    System.out.println("Please, input new tasks for Monday:");
                    schedule[1][1] = in.nextLine();
                    System.out.println();
                    break;
                case "change tuesday":
                    System.out.println("Please, input new tasks for Tuesday:");
                    schedule[2][1] = in.nextLine();
                    System.out.println();
                    break;
                case "change wednesday":
                    System.out.println("Please, input new tasks for Wednesday:");
                    schedule[3][1] = in.nextLine();
                    System.out.println();
                    break;
                case "change thursday":
                    System.out.println("Please, input new tasks for Thursday:");
                    schedule[4][1] = in.nextLine();
                    System.out.println();
                    break;
                case "change friday":
                    System.out.println("Please, input new tasks for Friday:");
                    schedule[5][1] = in.nextLine();
                    System.out.println();
                    break;
                case "change saturday":
                    System.out.println("Please, input new tasks for Saturday:");
                    schedule[6][1] = in.nextLine();
                    System.out.println();
                    break;
                case "change sunday ":
                    System.out.println("Please, input new tasks for Sunday:");
                    schedule[0][1] = in.nextLine();
                    System.out.println();
                    break;
                case "monday":
                    System.out.printf("Your Task for %s: %s", schedule[1][0], schedule[1][1]);
                    System.out.println();
                    break;
                case "tuesday":
                    System.out.printf("Your Task for %s: %s", schedule[2][0], schedule[2][1]);
                    System.out.println();
                    break;
                case "wednesday":
                    System.out.printf("Your Task for %s: %s", schedule[3][0], schedule[3][1]);
                    System.out.println();
                    break;
                case "thursday":
                    System.out.printf("Your Task for %s: %s", schedule[4][0], schedule[4][1]);
                    System.out.println();
                    break;
                case "friday":
                    System.out.printf("Your Task for %s: %s", schedule[5][0], schedule[5][1]);
                    System.out.println();
                    break;
                case "saturday":
                    System.out.printf("Your Task for %s: %s", schedule[6][0], schedule[6][1]);
                    System.out.println();
                    break;
                case "sunday":
                    System.out.printf("Your Task for %s: %s", schedule[0][0], schedule[0][1]);
                    System.out.println();
                    break;
                case "exit":
                    break label;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
            }

        }


    }
}

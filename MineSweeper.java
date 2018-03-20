import java.util.Scanner;
import java.io.*;
import java.util.*;
public class MineSweeper {
    public static int turns;
    public static boolean win;
    public static boolean lose;
    public int Rows;
    public int Columns;
    public static String player;
    public static int Board[][] = new int[1000][1000];

    public static void main(String[]args) {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Welcome to MineSweeper, this isn't a sterotypical coding project I swear!.");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Now, lets get started, would you like to play?");
        String Answer = scan.nextLine();
        if(Answer.equals("Y")) {
            System.out.println("Alright Lets begin!");
            BoardInputter();
        }
        if(Answer.equals("N")) {
            System.out.println("You are an Asshole for Not Playing.");
        }
    }

    public static int BoardInputter() {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Now, Please put in the row amount for your board.");
        int Rowamount = scan.nextInt();
        System.out.println("You typed" + " " + Rowamount + " " + "for the Rows you'd like to have.");
        System.out.println("Now, Please type the Column Amount.");
        int Columnamount = scan.nextInt();
        System.out.println("You typed" + " " + Columnamount + " " + "for the Columns you'd like to have.");
        return Rowamount;
       
    }
}

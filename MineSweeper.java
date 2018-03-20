import java.util.Scanner;
import java.io.*;
import java.util.*;
public class MineSweeper {
    public int turns;
    public static boolean win;
    public static boolean lose;
    public static String player;
    public static int Rowamount = 12;
    public static int Columnamount = 12;
    public static int[][]Board = new int[Rowamount][Columnamount];
    public static void main(String[]args) {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Welcome to MineSweeper, this isn't a sterotypical coding project I swear!.");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Now, lets get started, would you like to play, type Y for Yes and N for No.");
        String Answer = scan.nextLine();
        if(Answer.equals("Y")) {
            System.out.println("Alright Lets begin!");
            BoardPrinter();
        }
        if(Answer.equals("N")) {
            System.out.println("You are an Asshole for not Playing.");
        }
    }
    public static void BoardPrinter() {
        int[][]Board = new int [Rowamount][Columnamount];
        for(int Rowamount = 0; Rowamount < 12; ++Rowamount) {
            System.out.print("------------------------");
            System.out.println();
            for(int Columnamount = 0; Columnamount < 12; ++Columnamount) 
                System.out.print(Board[Rowamount][Columnamount] + "|");
                System.out.println();
            }
        }
    }

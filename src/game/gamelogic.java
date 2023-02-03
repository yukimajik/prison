package game;
import characters.player;

import java.util.Scanner;
public class gamelogic {
    static Scanner sc = new Scanner(System.in);

    static player player;

    public static boolean isRunning;
    public static int readint(String prompt, int userchoice){
        int input;

        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(sc.next());
            }catch(Exception e){
                input = -1;
                System.out.println("enter an integer");
            }
        }while(input < 1 || input > userchoice);
        return input;
    }
    public static void clearconsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
    public static void print(int n){
            for(int i = 0; i < n; i++)
                System.out.print("-");
            System.out.println();
            }
    public static void heading(String t){
        print(30);
        System.out.println(t);
        print(30);
    }
    public static void presstocontinue(){
        System.out.println("\n enter anything to continue...");
        sc.next();
    }
    public static void StartGame() {
        boolean nameset = false;
        String name;
        int ID;
        clearconsole();
        print(40);
        print(30);
        System.out.println("JAIL BREAK");
        print(30);
        print(40);
        presstocontinue();
        do {
            clearconsole();

            heading("what is your name and ID?");
            name = sc.next();
            ID = sc.nextInt();
            clearconsole();
            heading("is your name " + name + "?");
            System.out.println("(1) yes");
            System.out.println("(2) no");
            int input = readint("-->", 2);
            if (input == 1) {
                nameset = true;
            }
        } while (!nameset);
        heading("is your ID " + ID + "?");
        System.out.println("(1) yes");
        System.out.println("(2) no");
        int input = readint("-->", 2);
        if (input == 1) {
            nameset = true;
        }
     while (!nameset);
        player = new player(name, ID);
        gameLoop();
    }
    public static void continueGame(){

    }

    public static void printMenu(){
        clearconsole();
        heading("MENU");
        System.out.println("choose an action");
        print(20);
        System.out.println("(1) continue");
        System.out.println("(2) player info ");
        System.out.println("(3) exit");
    }

    public static void playerInfo(){
        clearconsole();
        heading("CHARACTER INFO");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        print(20);
        System.out.println("XP: " + player.xp);

        if(player.numatkupgrade > 0){
            System.out.println("Attack trait: " + player.atk[player.numatkupgrade - 1]);
            print(20);
        }
        if(player.numdefupgrade > 0){
            System.out.println("Attack trait: " + player.def[player.numdefupgrade - 1]);
            print(20);
        }
        if(player.numspeedupgrade > 0){
            System.out.println("Attack trait: " + player.speed[player.numspeedupgrade - 1]);
        }
        presstocontinue();
    }
    public static void gameLoop(){
        while(isRunning){
            printMenu();
            int input = readint("-->", 3);
            if(input == 1)
                continueGame();
            else if(input == 2)
                playerInfo();
            else
                isRunning = false;
        }
    }
}
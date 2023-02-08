package game;
import characters.player;

import java.util.Scanner;
public class gamelogic {
    static Scanner sc = new Scanner(System.in);

    static player player;

    public static boolean isRunning;
    public static String[] encounters = {"battle", "battle", "battle", "rest", "rest"};
    public static String[] enemies = {"enemy1", "enemy2", "enemy3", "enemy4", "enemy5"};
    public static int place = 0, act;
    public static String[] places = {"Jail cell", "Meeting room", "Asylum", "Cafeteria", "Courtyard", "Health room", "Shed"};
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
        do {
            nameset = false;
            clearconsole();
            heading("is your ID " + ID + "?");
            System.out.println("(1) yes");
            System.out.println("(2) no");
            int input = readint("-->", 2);
            if (input == 1) {
                nameset = true;
            }
            if (input == 2) {
                boolean idflag = false;
                do {
                    clearconsole();
                    heading("What is your ID?");
                    ID = sc.nextInt();
                    idflag = true;
                } while (!idflag);
            }
        }while(!nameset);
            story.printIntro();

            player = new player(name, ID);

            story.printEnterance();
            story.printjailCell();

            isRunning = true;

            gameLoop();
    }
    public static void checkAct(){
        if(player.xp >= 10 && act == 1){
             act = 2;
             place = 1;

             story.printMeeting();

             player.ChooseTrait();

             story.printOutside();
        }
        else if(player.xp >= 50 && act == 2){
            act = 3;
            place = 2;

            story.printInside();

            player.ChooseTrait();

            story.printAsylum();
        }
        else if(player.xp >= 100 && act == 3){
            act =4;
            place = 3;

            story.printExitAsylum();

            player.ChooseTrait();

            story.printCafeteria();
        }
        else if(player.xp >= 150 && act == 4){
            act = 5;
            place = 4;

            story.printExitCafeteria();

            player.ChooseTrait();

            story.printCourtyard();
        }
        else if(player.xp >= 200 && act == 5){
            act = 6;
            place = 5;

            story.printExitCourtyard();

            player.ChooseTrait();

            story.printHealthroom();
        }
        else if(player.xp >= 250 && act == 6){
            act = 7;
            place = 6;

            story.printExitHealthroom();

            player.ChooseTrait();

            story.printShed();
        }
        else if(player.xp >= 350 && act == 7){
            act = 8;
            place = 7;

            story.printExitshed();

            player.ChooseTrait();

            story.printEscape();
        }
        else if(player.xp >= 500 && act == 8){
            act = 9;
            place = 8;

            story.printEscaped();


        }
    }
    public static void randomEncounter(){
        int encounter = (int)(Math.random()* encounters.length);
        if(encounters[encounter].equals("battle")){

        }
        else if(encounters[encounter].equals("rest")){

        }
        else{

        }
    }

    public static void continueGame(){
        checkAct();
        if(act != 9){

        }
    }

    public static void printMenu(){
        clearconsole();
        heading(places[place]);
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
        print(20);

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
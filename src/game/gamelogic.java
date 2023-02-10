package game;
import characters.player;
import characters.enemy;
import items.harmful.weapons;
import items.util.utilinfo;
import items.util.util;

import java.util.Scanner;
public class gamelogic {
    static Scanner sc = new Scanner(System.in);

    static player player;
    static int randomenemy = (int)(Math.random()*1000);
    static int randomenemy1 = (int)(Math.random()*1000);
    static int randomenemy2 = (int)(Math.random()*1000);
    static int randomenemy3 = (int)(Math.random()*1000);
    static int randomenemy4 = (int)(Math.random()*1000);
    static int randomenemy5 = (int)(Math.random()*1000);
    static int randomenemy6 = (int)(Math.random()*1000);
    static int randomenemy7 = (int)(Math.random()*1000);

    static String randomenemystore = String.valueOf(randomenemy);
    static String randomenemystore1 = String.valueOf(randomenemy1);
    static String randomenemystore2 = String.valueOf(randomenemy2);
    static String randomenemystore3 = String.valueOf(randomenemy3);
    static String randomenemystore4 = String.valueOf(randomenemy4);
    static String randomenemystore5 = String.valueOf(randomenemy5);
    static String randomenemystore6 = String.valueOf(randomenemy6);
    static String randomenemystore7 = String.valueOf(randomenemy7);

    public static boolean isRunning;
    public static String[] encounters = {"battle", "battle", "battle", "battle", "battle"};
    public static String[] enemies = {"Prisoner " + randomenemystore,"Prisoner " + randomenemystore1,"Prisoner " + randomenemystore2,"Prisoner " + randomenemystore3,"Prisoner " + randomenemystore4,"Guard " + randomenemystore5,"Guard " + randomenemystore6,"Guard " + randomenemystore7};



    public static int place = 0, act = 1;
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
             presstocontinue();
             player.ChooseTrait();
             clearconsole();
             weapons.getweapon();
             System.out.println("you obtained a " + weapons.curentweapon.getName());
             System.out.println(weapons.curentweapon);
             presstocontinue();

             story.printOutside();
             presstocontinue();
             buy();
        }
        else if(player.xp >= 50 && act == 2){
            act = 3;
            place = 2;

            story.printInside();
            presstocontinue();

            story.printAsylum();
            presstocontinue();
            buy();
        }
        else if(player.xp >= 100 && act == 3){
            act =4;
            place = 3;

            story.printExitAsylum();
            presstocontinue();
            story.printCafeteria();
            presstocontinue();
            buy();
        }
        else if(player.xp >= 150 && act == 4){
            act = 5;
            place = 4;

            story.printExitCafeteria();
            presstocontinue();
            player.ChooseTrait();
            clearconsole();
            weapons.getweapon();
            System.out.println("you obtained a " + weapons.curentweapon.getName());
            System.out.println(weapons.curentweapon.toString());

            story.printCourtyard();
            presstocontinue();
            buy();
        }
        else if(player.xp >= 200 && act == 5){
            act = 6;
            place = 5;

            story.printExitCourtyard();
            presstocontinue();


            story.printHealthroom();
            presstocontinue();
            buy();
        }
        else if(player.xp >= 250 && act == 6){
            act = 7;
            place = 6;

            story.printExitHealthroom();
            presstocontinue();

            player.ChooseTrait();

            story.printShed();
            presstocontinue();
            buy();

            player.hp = player.maxHp;
            System.out.println("hp got restored");
        }
        else if(player.xp >= 350 && act == 7){
            act = 8;
            place = 7;

            story.printExitshed();
            presstocontinue();

            player.ChooseTrait();
            clearconsole();
            weapons.getweapon();
            System.out.println("you obtained a " + weapons.curentweapon.getName());
            System.out.println(weapons.curentweapon.toString());
            weapons.getweapon();

            story.printEscape();
            presstocontinue();
            buy();
        }
        else if(player.xp >= 500 && act == 8){
            act = 9;
            place = 8;
            finalbattle();


        }
    }
    public static void randomEncounter(){
        int encounter = (int)(Math.random()* encounters.length);
        if(encounters[encounter].equals("battle")){
            randomBattle();
        } else{
            buy();
        }
    }

    public static void continueGame(){
        checkAct();
        if(act != 9){
            randomEncounter();
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

    public static void buy(){
        clearconsole();
        System.out.println("A random officer confronted you. . .");
        System.out.println("The officer offers you items, in return he demands money");
        int price = 10;
        print(20);
        System.out.println("would you like to buy something random\n(1) Yes\n(2) No");
        int input = readint("-->",2);
        if(input == 1){
            clearconsole();
            if(player.money >= price){
                heading("you bought " + util.getitem().getName());
                player.heals++;
                presstocontinue();
            }else{
                System.out.println("you dont have enough gold");
                presstocontinue();
            }
        }
    }

    public static void playerInfo(){
        clearconsole();
        heading("CHARACTER INFO");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        print(20);
        System.out.println("XP: " + player.xp + "\tmoney: " + player.money + " ");
        print(20);
        System.out.println("# of healing items: " + player.heals );
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

    public static void randomBattle(){
        clearconsole();
        heading("You get yourself into a fight. . .");
        presstocontinue();

        battle(new enemy(enemies[(int)(Math.random()*enemies.length)],player.xp));
    }

    public static void battle(enemy enemy){
        while(true){
            clearconsole();
            heading(enemy.name + "\nHP" + enemy.hp + "/" + enemy.maxHp);
            heading(player.name + "\nHP" + player.hp + "/" + player.maxHp);
            System.out.println("Choose an action:");
            print(20);
            System.out.println("(1) fight\n(2) heal\n(3) run");
            int input = readint("-->",3);
            if(input  == 1) {
                int dmg = player.attack() - enemy.defend();
                int dmgtaken = enemy.attack() - player.defend();
                if(dmgtaken < 0){
                    dmg -= dmgtaken/2;
                    dmgtaken = 0;
                }
                if(dmg < 0) {
                    dmg = 0;
                }
                    player.hp -= dmgtaken;
                    enemy.hp -= dmg;
                    clearconsole();
                    heading("BATTLE");
                    System.out.println("You dealt " + dmg + " damage to the " + enemy.name + ".");
                    if(player.hp + weapons.curentweapon.getHeal() < player.maxHp) {
                        player.hp += weapons.curentweapon.getHeal();
                        System.out.println("Your " + weapons.curentweapon.getName() + " healed you for " + weapons.curentweapon.getHeal() + " Hp");
                    }
                    print(15);
                    System.out.println("You took " + dmgtaken + " damage from the " + enemy.name + ".");
                    presstocontinue();
                    if(player.hp <= 0){
                        playerdied();
                        break;
                    } else if(enemy.hp <= 0) {
                        clearconsole();
                        heading("you defeated the " + enemy.name + ".");
                        player.xp += enemy.xp;
                        System.out.println("You earned " + enemy.xp + "XP.");
                        int moneyearned = (int)(Math.random()*enemy.xp);
                        if(moneyearned > 0){
                            player.money += moneyearned;
                            System.out.println("You collected " + moneyearned + " dollars.");
                        }
                        presstocontinue();
                        break;
                    }
                }

            else if(input == 2){
                clearconsole();
                if(player.heals > 0 && player.hp < player.maxHp){
                    heading("Do you want to take a heal? (" + player.heals+ " left).");
                    System.out.println("(1) Yes\n(2) No");
                    input = readint("-->", 2);
                    if(input == 1) {
                        player.hp = player.maxHp;
                        clearconsole();
                        heading("you used a heal. It restored health");
                        presstocontinue();
                    }
                    else if(input == 2){
                        clearconsole();
                        System.out.println("you did not take a potion");
                        presstocontinue();
                    }
                }else{
                    heading("you cannot take a potion.");
                    presstocontinue();
                }
            }
            else{
                clearconsole();
                if(act !=7) {
                    if (Math.random() * 10 + 1 <= 2.5) {
                        heading("You ran away.");
                        presstocontinue();
                        break;
                    } else {
                        heading("You failed to escape.");
                        int dmgtaken = enemy.attack();
                        System.out.println("While trying to escape you took " + dmgtaken + " damage.");
                        presstocontinue();
                        if (player.hp <= 0) {
                            playerdied();
                        }
                    }
                }else{
                    heading("YOU CANNOT ESCAPE.");
                    presstocontinue();
                }
            }
        }
    }
    public static void finalbattle(){
        battle(new enemy("THE WARDEN",250));

        story.printEscaped();
        isRunning = false;

    }
    public static void playerdied(){
        clearconsole();
        heading("You died. . .");
        heading("You earned " + player.xp + " XP, good try.");
        System.out.println("Thanks for playing");
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
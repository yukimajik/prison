package characters;

import game.gamelogic;

public  class player extends person{

    public int numatkupgrade, numdefupgrade, numspeedupgrade;

    public String [] atk = {"weak", "strong","super strong", "godlike"};
    public String [] def = {"thin bones", "normal bones", "thick bones"};
    public String [] speed = {"slow", "normal", "quick", "fast"};

    public player(String name, int ID){
        super(name,100,0);
        this.numatkupgrade = 0;
        this.numdefupgrade = 0;
        this.numspeedupgrade = 0;
        ChooseTrait();
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public int run() {
        return 0;
    }
    public void ChooseTrait(){
        gamelogic.clearconsole();
        gamelogic.heading("Choose a trait:");
        System.out.println("(1) " + atk[numatkupgrade]);
        System.out.println("(2) " + def[numdefupgrade]);
        System.out.println("(3) " + speed[numspeedupgrade]);

        int input = gamelogic.readint(" -->", 3);
        gamelogic.clearconsole();
        if(input == 1){
            gamelogic.heading("you chose  " + atk[numatkupgrade]);
        }
        else if (input == 2) {
            gamelogic.heading("you chose  " + def[numdefupgrade]);
        }else{
            gamelogic.heading("you chose  " + speed[numspeedupgrade]);
        }
        gamelogic.presstocontinue();
    }
}

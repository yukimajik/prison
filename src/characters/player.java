package characters;

import game.gamelogic;
import items.harmful.weapons;

public  class player extends person{

    public int numatkupgrade, numdefupgrade, numspeedupgrade;

    public int money, heals;
    public String [] atk = {"hardened knuckles", "Metal Fingers","Advanced Weapon Use", "Godlike Fighting Skills"};
    public String [] def = {"thick bones", "Metal Bones", "Indestructible Bones", "GunProof Skin"};
    public String [] speed = {"flexable ankles", "Speedy Legs", "Speed Shoes", "Lighting Fast"};

    public player(String name, int ID){
        super(name,100,0);
        this.numatkupgrade = 0;
        this.numdefupgrade = 0;
        this.numspeedupgrade = 0;
        this.money = 5;
        this.heals = 4;
        ChooseTrait();
    }

    @Override
    public int attack() {
        return (int)(Math.random()*(xp/4 + numatkupgrade*3+3)+xp/10 + numatkupgrade*2 + numdefupgrade+1 + numspeedupgrade + weapons.curentweapon.getDmg());
    }

    @Override
    public int defend() {
        return (int)(Math.random()*(xp/4+numdefupgrade*33+3)+xp/10 + numdefupgrade*2 + numdefupgrade + 1 + numspeedupgrade);
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
            gamelogic.heading("you chose " + atk[numatkupgrade]);
            numatkupgrade+=1;
        }
        else if (input == 2) {
            gamelogic.heading("you chose  " + def[numdefupgrade]);
            numdefupgrade+=1;
        }else{
            gamelogic.heading("you chose  " + speed[numspeedupgrade]);
            numspeedupgrade+=1;
        }
        gamelogic.presstocontinue();
    }
}

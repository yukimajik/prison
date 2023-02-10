package characters;

public class enemy extends person{

    int playerxp;

    public enemy(String name, int playerxp) {
        super(name, (int)(Math.random()*playerxp + playerxp/3+5),(int) (Math.random()*(playerxp/4+2))+1);

        this.playerxp = playerxp;
    }

    @Override
    public int attack() {
        return (int)(Math.random()*(playerxp/4+1)+ xp/4+3);
    }

    @Override
    public int defend() {
        return (int)(Math.random()*(playerxp/4+1)+ xp/4+1);
    }

    @Override
    public int run() {
        return 0;
    }
}

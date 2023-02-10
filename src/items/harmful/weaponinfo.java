package items.harmful;

public class weaponinfo extends weapons {


    public weaponinfo(int dmg, int heal, String name, String description) {
        super(dmg, heal, name, description);
    }

    static weapons bat = new weapons(1,0,"bat", "a big stick that deals big amounts of damage");
    static weapons karambit = new weapons(3,1,"karambit", "cool looking thing");
    static weapons butterfly = new weapons(4,2,"butterfly knife", "can it fly?");
    static weapons dorans = new weapons(5,3,"DORANS BLADE", "BLADE");
    static weapons bayonet = new weapons(2,1,"bayonet", "old thing");
    static weapons butcher = new weapons(1,2,"butcher", "im a chef");
    static weapons plastic = new weapons(1,0,"plastic knife", "does this even hurt?");
    static weapons razor = new weapons(1,1,"razor blade", "who wants their beard trimmed?");
    static weapons fork = new weapons(1,1,"fork", "i mean it works");
    static weapons astraModel = new weapons(7,0,"Astra Model 900", "its a gun");
    static weapons deserteagle = new weapons(10,0,"Desert Eagle", "i think this flies");
    static weapons glock = new weapons(5,0,"Glock-18", "gun");
    static weapons tec9 = new weapons(3,2,"Tec-9", "gun");

    static weapons weaponslist[] = {bat,karambit,butterfly,dorans,bayonet,butcher,plastic,razor,fork,astraModel,deserteagle,glock,tec9};
}

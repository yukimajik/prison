package items.harmful;

public class weapons {
    private int dmg;
    private int heal = 0;
    private String name;
    private String description;
    private int rarity;

    public weapons(int dmg, int heal, String name, String description) {
        this.dmg = dmg;
        this.heal = heal;
        this.name = name;
        this.description = description;
    }

    public static weapons curentweapon = weapons.getweapon();


    public static weapons getweapon() {
        int randomnumber = 0;
        for (int i = 0; i < 10; i++) {
            randomnumber = (int) (Math.random() * weaponinfo.weaponslist.length);
        }
        curentweapon = weaponinfo.weaponslist[randomnumber];

        return curentweapon;
    }

    public static weapons Curentweapon() {
        return curentweapon;
    }

    public String toString() {
        return this.getName() + ":" + "\n" + this.getDescription() + "\nDeals: " + this.getDmg() + " dmg\nHeals: " + this.getHeal() + " dmg";
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getHeal(){
        return heal;
    }

    public void setHeal(int heal){
        this.heal = heal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }
}


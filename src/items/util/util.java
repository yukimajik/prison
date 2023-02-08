package items.util;

public class util {
    private int heal = 0;
    private String name;
    private String description;
    private int rarity;
    private int count;

    public util(int count, int heal, String name, String description) {
        this.count = count;
        this.heal = heal;
        this.name = name;
        this.description = description;
    }

    public String toString() {
        return this.getName() + ":" + "\n" + this.getDescription() + "\nYou have:" + this.getCount() + "\nHeals: " + this.getHeal();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void addCount(){
        this.count++;
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

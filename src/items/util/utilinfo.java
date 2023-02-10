package items.util;

public class utilinfo extends util{

    public utilinfo(int count, int heal, String name, String description) {
        super(count, heal, name, description);
    }
    public static util medKit = new util(1,10,"medkit", "heals");
    public static util bandage = new util(1,5,"bandage", "heals");
    util money = new util(1,5,"money", "heals");
    static util needle = new util(1,5,"needle", "heals");
    static util pills = new util(1,5,"pills", "heals");

    util randomutil[] = {medKit,bandage,needle,pills};

}

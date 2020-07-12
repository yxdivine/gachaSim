package yxdivine.gachaSim.basic;

/**
 * 物品稀有度
 */
public enum RarityLevel {
    Common(0, "普通", ""),
    Rare(1, "稀有", ""),
    Uncommon(2, "罕见", ""),
    Heroic(3, "史诗", ""),
    Legendary(4, "传奇", "");
    int rarity;
    String label;
    String color;

    RarityLevel(int rarity, String label, String color) {
        this.rarity = rarity;
        this.label = label;
        this.color = color;
    }
}

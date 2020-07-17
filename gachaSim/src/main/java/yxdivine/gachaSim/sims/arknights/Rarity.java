package yxdivine.gachaSim.sims.arknights;

public enum Rarity {
    Six(0, "六星干员", ""),
    Five(1, "五星干员", ""),
    Four(2, "四星干员", ""),
    Three(3, "三星干员", "");

    int rarity;
    String label;
    String color;

    Rarity(int rarity, String label, String color) {
        this.rarity = rarity;
        this.label = label;
        this.color = color;
    }


    @Override
    public String toString() {
        return label;
    }
}

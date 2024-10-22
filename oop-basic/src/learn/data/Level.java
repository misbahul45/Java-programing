package learn.data;

public enum Level {
    STANDART("standart level"),
    PREMIUM("premium level"),
    VIP("vip Level");

    String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
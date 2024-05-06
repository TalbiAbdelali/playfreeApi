package com.ata.playFreeAPi.enums;

public enum Level {
    BEGINNER("Beginner"),
    INTERMEDIATE("Intermediate"),
    ADVANCED("Advanced");

    private final String levelDescription;

    Level(String levelDescription) {
        this.levelDescription = levelDescription;
    }

    public String getLevelDescription() {
        return levelDescription;
    }
}

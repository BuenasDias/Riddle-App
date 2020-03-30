package com.tolstobrov.riddleapp;

public class Riddle {
    private String riddleName;
    private String riddleAnswer;
    private String riddleText;
    private int musicResourceId;

    public Riddle(String riddleName, String riddleAnswer, String riddleText, int musicResourseId) {
        this.riddleName = riddleName;
        this.riddleAnswer = riddleAnswer;
        this.riddleText = riddleText;
        this.musicResourceId = musicResourseId;
    }

    public String getRiddleName() {
        return riddleName;
    }

    public String getRiddleAnswer() {
        return riddleAnswer;
    }

    public String getRiddleText() {
        return riddleText;
    }

    public int getMusicResourseId() {
        return musicResourceId;
    }

    @Override
    public String toString() {
        return "Riddle{" +
                "riddleName='" + riddleName + '\'' +
                '}';
    }
}

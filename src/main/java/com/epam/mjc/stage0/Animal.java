package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public Animal() {

    }
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    protected void getDescription(String color, int numberOfPaws, boolean hasFur) {
        if (numberOfPaws == 1) {
            System.out.println("This animal is mostly " + color + ". It has " + numberOfPaws + " paw and ('a'/'no' -> depends on value of" + hasFur + ") fur.");
        } else {
            System.out.println("This animal is mostly " + color + ". It has " + numberOfPaws + " paws and ('a'/'no' -> depends on value of" + hasFur + ") fur.");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getDescription("blue", 2, true);
        Bird bird = new Bird();
        bird.getDescription("brown", 4, false);
    }
}

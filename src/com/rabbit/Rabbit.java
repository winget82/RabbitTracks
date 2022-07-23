package com.rabbit;

public class Rabbit {
    private String name;
    private int age;
    private String colorPattern;
    private int totalLitters;
    private boolean male;
    private BreedingNote[] breedingNotes;
    private Litter[] litters;

    public Rabbit(String name, int age, String colorPattern, int totalLitters) {
        this.name = name;
        this.age = age;
        this.colorPattern = colorPattern;
        this.totalLitters = totalLitters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColorPattern() {
        return colorPattern;
    }

    public void setColorPattern(String colorPattern) {
        this.colorPattern = colorPattern;
    }

    public int getTotalLitters() {
        return totalLitters;
    }

    public void setTotalLitters(int totalLitters) {
        this.totalLitters = totalLitters;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public BreedingNote[] getBreedingNotes() {
        return breedingNotes;
    }

    public void setBreedingNotes(BreedingNote[] breedingNotes) {
        this.breedingNotes = breedingNotes;
    }

    public Litter[] getLitters() {
        return litters;
    }

    public void setLitters(Litter[] litters) {
        this.litters = litters;
    }
}

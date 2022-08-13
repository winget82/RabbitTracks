package com.rabbit;

import java.sql.Date;

public class Rabbit {
    private String name;
    private Date birthDate;
    private String breed;
    private String colorPattern;
    private int totalLitters;
    private boolean male;
    private BreedingNote[] breedingNotes;
    private Litter[] litters;

    public Rabbit(String name, Date birthDate, String colorPattern, int totalLitters, String breed) {
        this.name = name;
        this.birthDate = birthDate;
        this.colorPattern = colorPattern;
        this.totalLitters = totalLitters;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

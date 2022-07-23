package com.rabbit;

import java.sql.Date;

public class Kit {

    private Date birthDate;
    private Date harvestDate;
    private String dam;
    private String sire;
    private String color;
    private int weightPounds;
    private float weightOunces;
    private boolean harvestable;

    public Kit(Date birthDate, Date harvestDate, String dam, String sire, String color, int weightPounds, float weightOunces) {
        this.birthDate = birthDate;
        this.harvestDate = harvestDate;
        this.dam = dam;
        this.sire = sire;
        this.color = color;
        this.weightPounds = weightPounds;
        this.weightOunces = weightOunces;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(Date harvestDate) {
        this.harvestDate = harvestDate;
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    public float getWeightOunces() {
        return weightOunces;
    }

    public void setWeightOunces(float weightOunces) {
        this.weightOunces = weightOunces;
    }

    public boolean isHarvestable() {
        return harvestable;
    }

    public void setHarvestable(boolean harvestable) {
        this.harvestable = harvestable;
    }
}

package com.rabbit;

public class Litter {
    private String litterName;
    private int totalKits;
    private int totalHarvestedKits;
    private int totalUnharvestableKits;
    private double feedPerKit;
    private String litterNotes;
    private Kit[] kits;

    public Litter(String litterName, int totalKits, int totalHarvestedKits, int totalUnharvestableKits,
                  String litterNotes) {
        this.litterName = litterName;
        this.totalKits = totalKits;
        this.totalHarvestedKits = totalHarvestedKits;
        this.totalUnharvestableKits = totalUnharvestableKits;
        this.litterNotes = litterNotes;
    }


    public String getLitterName() {
        return litterName;
    }

    public void setLitterName(String litterName) {
        this.litterName = litterName;
    }

    public int getTotalKits() {
        return totalKits;
    }

    public void setTotalKits(int totalKits) {
        this.totalKits = totalKits;
    }

    public int getTotalHarvestedKits() {
        return totalHarvestedKits;
    }

    public void setTotalHarvestedKits(int totalHarvestedKits) {
        this.totalHarvestedKits = totalHarvestedKits;
    }

    public int getTotalUnharvestableKits() {
        return totalUnharvestableKits;
    }

    public void setTotalUnharvestableKits(int totalUnharvestableKits) {
        this.totalUnharvestableKits = totalUnharvestableKits;
    }

    public String getLitterNotes() {
        return litterNotes;
    }

    public void setLitterNotes(String litterNotes) {
        this.litterNotes = litterNotes;
    }

    public Kit[] getKits() {
        return kits;
    }

    public void setKits(Kit[] kits) {
        this.kits = kits;
    }

    public double getFeedPerKit() {
        return feedPerKit;
    }

    public void setFeedPerKit(double feedPerKit) {
        this.feedPerKit = feedPerKit;
    }

    //can get birthdate, dam, and sire via kit

}

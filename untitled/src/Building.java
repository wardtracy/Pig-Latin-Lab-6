public class Building {

    private int sqFt;
    private String location;

    public Building(int sqFt, String location) {
        this.sqFt = sqFt;
        this.location = location;
    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
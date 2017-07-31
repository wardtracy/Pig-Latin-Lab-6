public class House extends Building {

    private String familyName;

    public House(int sqFt, String location, String familyName) {
        super(sqFt, location);
        this.familyName = familyName;

    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}

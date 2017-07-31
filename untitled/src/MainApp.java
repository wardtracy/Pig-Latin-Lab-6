import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Building building1 = new Building(3600, "1570 Woodward");
        House house1 = new House(1200, "9303 Jefferson", "Ward's");

        System.out.println(house1.getSqFt());

        // house one got a 300 sq ft addition
        house1.setSqFt(1500);

        System.out.println(house1.getSqFt());

        // sold my house to my mom
        house1.setFamilyName("Cardwell");
        System.out.println(house1.getFamilyName());



    }

}

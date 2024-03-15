package u20240315t1;

import java.util.ArrayList;
import java.util.List;

public class KfzTest {
    public static void main(String[] args) {
        Kfz auto1 = new Kfz();
        auto1.hersteller = "VW";
        auto1.model = "Golf 8";
        auto1.hubraum = 2000;

        Kfz auto2 = new Kfz("BMW", "520i", 3500);

        List<Kfz> listOfAutos = new ArrayList<>();
        listOfAutos.add(auto1);
        listOfAutos.add(auto2);

        for(Kfz auto : listOfAutos){
            System.out.println(auto);
        }
    }
}
package u20240315t1;

public class Kfz {
    String hersteller;
    String model;
    int hubraum;

    public  Kfz(){
        super();
    }
    public  Kfz(String hersteller, String model, int hubraum){
        this.hersteller = hersteller;
        this.model = model;
        this.hubraum = hubraum;
    }

    @Override
    public String toString(){
        return String.format("Auto %s von %s, hubraum: %d", model, hersteller, hubraum);
    }

    public static void printAuto(Kfz auto){
        System.out.println(auto);
    }
}
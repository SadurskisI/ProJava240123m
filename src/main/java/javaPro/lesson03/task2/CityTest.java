package javaPro.lesson03.task2;


public class CityTest {
    public static void main(String[] args) {

        City.valueOf("BERLIN");
        City[] cities = City.values();
        System.out.println();

        for (City city:cities) {
            System.out.println(city);
        }


        City berlin = City.BERLIN;

        String cityInfo = berlin.toString();
        System.out.println();


        City lisabon = City.LISBON;
        System.out.println(lisabon.isPopular());
        System.out.println(berlin.isPopular());

    }
}

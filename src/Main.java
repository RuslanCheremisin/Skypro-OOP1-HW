public class Main {
    public static void main(String[] args) {



        Human maxim = new Human("Maxim", 35, "Minsk","бренд-менеджер");
        maxim.greeting();
        Human anya = new Human();
        anya.setName("Anya");
        anya.setBirthYear(1998);
        anya.setResidence("Moscow");
        anya.setJob("тьютор");
        anya.greeting();
        Human katya = new Human();
        katya.setName("");
        katya.setBirthYear(234);
        katya.setResidence("Vladivostok");
        katya.setJob(null);
        katya.greeting();
        Human artyom = new Human();
        artyom.setName("Artyom");
        artyom.setBirthYear(1997);
        artyom.setResidence("Khabarovsk");
        artyom.setJob(null);
        artyom.greeting();
        Human vladimir = new Human();
        vladimir.setName("Vladimir");
        vladimir.setBirthYear(1995);
        vladimir.setResidence("Kazan");
        vladimir.setJob("nowhere");
        vladimir.greeting();
        System.out.println("+++++++++++++++++++++++++");

//        Car ladaGranta = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        Car ladaGranta = new Car();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.giveFullInfo();

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        audiA8.giveFullInfo();
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        bmwZ8.giveFullInfo();
        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "red", 2018, "South Korea");
        kiaSportage.giveFullInfo();
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");
        hyundaiAvante.giveFullInfo();
//
        System.out.println("+++++++++++++++++++++++++");

        Flower rosa = new Flower("Rose", "Netherlands", 35.59, 0);
        rosa.getFullInfo();
        Flower goldenDaisy = new Flower("Golden-daisy", null, 15.00, 5);
        goldenDaisy.getFullInfo();

        Flower peony = new Flower();
        peony.setFlowerColor("Peony");
        peony.setCost(69.90);
        peony.setCountry("UK");
        peony.setLifeSpan(1);

        Flower gypsophila = new Flower("Gypsophila", "Turkey", 19.50, 10);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rosa);
        bouquet.addFlower(rosa);
        bouquet.addFlower(rosa);
        bouquet.addFlower(goldenDaisy);
        bouquet.addFlower(goldenDaisy);
        bouquet.addFlower(goldenDaisy);
        bouquet.addFlower(goldenDaisy);
        bouquet.addFlower(gypsophila);

        bouquet.getBouquetInfo();




      

    }


}

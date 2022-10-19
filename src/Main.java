public class Main {
    public static void main(String[] args) {



        Human maxim = new Human("Maxim", 35, "Minsk","бренд-менеджер");
        maxim.greeting();
        Human anya = new Human("Anya", 29, "Moscow");
        anya.greeting();
        Human katya = new Human("Katya","продакт-менеджер",28);
        katya.greeting();
        Human artyom = new Human( 27, "Moscow", "директор по развитию бизнеса");
        artyom.greeting();

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




      

    }


}

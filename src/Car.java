public class Car {

    String brand;
    String model;
    double engineDisplacement;
    String colour;
    int productionYear;
    String originCountry;

    Car() {
        this.brand = "default";
        this.model = "default";
        this.engineDisplacement = 1.5;
        this.colour = "white";
        if(productionYear<1886){
            this.productionYear = 2000;
        }
        this.originCountry = "default";
    }
    Car(String brand, String model, double engineDisplacement, String colour, int productionYear, String originCountry) {
        this.brand = brand;
        this.model = model;
        this.engineDisplacement = engineDisplacement;
        this.colour = colour;
        if(productionYear<1886){
            this.productionYear = 2000;
        }
        this.originCountry = originCountry;

    }

    void giveFullInfo(){
        System.out.println(colour+" "+brand+" "+model+" made in "+originCountry+" in "+productionYear+". Engine displacement:"+engineDisplacement);
    }
}

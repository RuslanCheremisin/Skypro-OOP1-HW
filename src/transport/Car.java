package transport;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {

    private String brand;
    private String model;
    private double engineDisplacement;
    private String colour;
    private int productionYear;
    private String originCountry;

    private String gearBox;
    private String bodyType;
    private String numberPlate;

    private int numberOfSeats;
    private String [] tyreTypes = {"Winter tyres", "Summer tyres"};
    private String tyres = tyreTypes[0];

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        if (gearBox!=null || !gearBox.isEmpty() || !gearBox.isBlank()) {
            this.gearBox = gearBox;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        if (bodyType!=null || !bodyType.isEmpty() || !bodyType.isBlank()) {
            this.bodyType = bodyType;
        }
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        numberPlate = numberPlate.toUpperCase();
        Pattern pattern1 = Pattern.compile("[ABCEHKMOPTXY]+[0-9]+[0-9]+[0-9]+[ABCEHKMOPTXY]+[0-9]+[0-9]");
        Pattern pattern2 = Pattern.compile("[ABCEHKMOPTXY]+[0-9]+[0-9]+[0-9]+[ABCEHKMOPTXY]+[0-9]+[0-9]+[0-9]");
        Matcher matcher1 = pattern1.matcher(numberPlate);
        Matcher matcher2 = pattern2.matcher(numberPlate);
        if (matcher1.matches() || matcher2.matches()) {
            this.numberPlate = numberPlate;
        }

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }



    public Car() {
        this.brand = "default";
        this.model = "default";
        this.engineDisplacement = 1.5;
        this.colour = "white";
        if(productionYear<1886){
            this.productionYear = 2000;
        }
        this.originCountry = "default";
    }
    public Car(String brand, String model, double engineDisplacement, String colour, int productionYear, String originCountry) {
        if (brand!=null || !brand.isBlank() || !brand.isEmpty()) {
            this.brand = brand;
        }
        if (model!=null || !model.isBlank() || !model.isEmpty()) {
            this.model = model;
        }
        if (colour!=null || !colour.isBlank() || !colour.isEmpty()) {
            this.colour = colour;
        }
        this.engineDisplacement = engineDisplacement;
        if (productionYear < 1886) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (originCountry!=null || !originCountry.isBlank() || !originCountry.isEmpty()) {
            this.originCountry = originCountry;
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public String getColour() {
        return colour;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void changeTyres() {

        if (tyres == tyreTypes[0]) {
            tyres = tyreTypes[1];
            System.out.println(tyreTypes[1]+" installed");
        } else {
            tyres = tyreTypes[0];
            System.out.println(tyreTypes[0]+" installed");
        }
    }

    public void giveFullInfo(){
        System.out.println(getColour()+" "+getBrand()+" "+getModel()+" made in "+getOriginCountry()+" in "+getProductionYear()+". Engine displacement:"+getEngineDisplacement());
        System.out.println("Registration number: "+numberPlate);
        System.out.println(tyres+" are installed");
        System.out.println(getGearBox()+" gearbox");
        System.out.println(getNumberOfSeats()+" seats");
    }
}

package transport;

import java.time.LocalDate;
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
    private String[] tyreTypes = {"Winter tyres", "Summer tyres"};
    private String tyres = tyreTypes[0];

    public Car() {
        this.brand = "default";
        this.model = "default";
        this.engineDisplacement = 1.5;
        this.colour = "white";
        if (productionYear < 1886) {
            this.productionYear = 2000;
        }
        this.originCountry = "default";
    }

    public Car(String brand, String model, double engineDisplacement, String colour, int productionYear, String originCountry) {
        this.brand = validateValue(brand);
        this.model = validateValue(model);
        this.colour = validateValue(colour);
        this.originCountry = validateValue(originCountry);

        if (engineDisplacement < 0) {
            System.out.println("Incorrect entry");
        } else {
            this.engineDisplacement = engineDisplacement;
        }
        if (productionYear < 1886) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }


    }

    public static class Insurance {
        private int validityYear;
        private String insuranceNumber;
        private int insurancePrice;

        public Insurance(int validityYear, String insuranceNumber, int insurancePrice) {

            if (validityYear >= LocalDate.now().getYear()) {
                this.validityYear = validityYear;
            }


            if (insuranceNumber!=null) {
                if (insuranceNumber.length() != 9) {
                    this.insuranceNumber = "Incorrect entry";
                }else {
                    this.insuranceNumber = validateValue(insuranceNumber);
                }
            } else{
                this.insuranceNumber = "Empty entry";
            }

            if (insurancePrice > 0) {
                this.insurancePrice = insurancePrice;
            }

        }

        public int getValidityYear() {
            return validityYear;
        }

        public void setValidityYear(int validityYear) {
            this.validityYear = validityYear;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public void setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = validateValue(insuranceNumber);
        }

        public int getInsurancePrice() {
            return insurancePrice;
        }

        public void setInsurancePrice(int insurancePrice) {
            this.insurancePrice = insurancePrice;
        }
    }

    private Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public static class Key {
        public String getKeylessAccess() {
            return keylessAccess;
        }

        public String getRemoteLaunch() {
            return remoteLaunch;
        }

        private String keylessAccess;

        private String remoteLaunch;

        public Key(String keylessAccess, String remoteLaunch) {
            this.keylessAccess = validateValue(keylessAccess);
            this.remoteLaunch = validateValue(remoteLaunch);
        }

        public void setKeylessAccess(String keylessAccess) {
            this.keylessAccess = validateValue(keylessAccess);
        }

        public void setRemoteLaunch(String remoteLaunch) {
            this.remoteLaunch = validateValue(remoteLaunch);
        }
    }

    private Key key;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = validateValue(gearBox);
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = validateValue(bodyType);
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
            System.out.println(tyreTypes[1] + " installed");
        } else {
            tyres = tyreTypes[0];
            System.out.println(tyreTypes[0] + " installed");
        }
        System.out.println("++++++++++++++++++++++++++");
    }

    public static String validateValue(String value) {
        if (value != null && !value.isEmpty() && !value.isBlank()) {
            return value;
        } else {
            return "Incorrect entry";
        }
    }

    public void giveFullInfo() {
        System.out.println(getColour() + " " + getBrand() + " " + getModel() + " made in " + getOriginCountry() + " in " + getProductionYear() + ". Engine displacement:" + getEngineDisplacement());
        System.out.println("Registration number: " + numberPlate);
        System.out.println("Body type:" + getBodyType());
        System.out.println(tyres + " are installed");
        System.out.println(getGearBox() + " gearbox");
        System.out.println(getNumberOfSeats() + " seats");
        System.out.println(key.getKeylessAccess() + ", " + key.getRemoteLaunch());
        System.out.println("Insurance info: ");
        System.out.println("Insurance No: "+insurance.getInsuranceNumber());
        if (insurance.validityYear == 0) {
            System.out.println("Insurance expired");
        } else {
            System.out.println("Insurance valid till: "+insurance.getValidityYear());
        }
        if (insurance.getInsurancePrice() == 0) {
            System.out.println("No data on price");
        } else {
            System.out.println("Insurance price: "+insurance.getInsurancePrice());
        }
        System.out.println();

    }


}

public class Flower {
    private String flowerColor;
    private String country;
    double cost;
    private int lifeSpan = 3;

    Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            flowerColor = "Белый";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            country = "Россия";
        }

        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }


    }

    Flower() {

    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            flowerColor = "Белый";
        }
    }

    public void setCountry(String country) {
        if (country != null || !country.isEmpty() || !country.isBlank()) {
            this.country = country;
        }else{
            this.country = "Russia";
        }
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public String getCountry() {
        return country;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void getFullInfo(){
        System.out.println(flowerColor+"\n"+country+"\n"+"Стоимость: "+cost+"\n"+"Срок стояния: "+lifeSpan);
        System.out.println("----------------------------------------");
    }

    public double getbouquet(){

        return cost;
    }
}


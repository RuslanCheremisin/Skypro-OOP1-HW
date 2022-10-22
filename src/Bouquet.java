import java.util.Arrays;

public class Bouquet {
    private double sum = 0;
    private Flower [] flowerBouquet = new Flower[1];
    Bouquet() {

    }

    public void addFlower(Flower flower) {

        for (int i = 0; i < flowerBouquet.length; i++) {
            if (flowerBouquet[i]==null){
                this.flowerBouquet[i] = flower;
            }
        }
        this.flowerBouquet = Arrays.copyOf(flowerBouquet, flowerBouquet.length+1);
    }

    public void getBouquetInfo(){
        int minLifeSpan = Integer.MAX_VALUE;
        System.out.println("Состав букета:");
        for (int i = 0; i < flowerBouquet.length; i++) {
            if (flowerBouquet[i] != null) {
                sum += flowerBouquet[i].getCost();
                System.out.println(flowerBouquet[i].getFlowerColor());
                if (flowerBouquet[i].getLifeSpan()<minLifeSpan) {
                    minLifeSpan = flowerBouquet[i].getLifeSpan();
                }
            }
        }
        System.out.println("Срок стояния букета:"+minLifeSpan);
        System.out.println("Стоимость букета:"+sum);
    }
}

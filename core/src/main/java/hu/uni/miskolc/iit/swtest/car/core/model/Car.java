package hu.uni.miskolc.iit.swtest.car.core.model;

public class Car {


    private int id;
    private String manufacturer;
    private String model;
    private int vintage; //evjarat
    private String color;
    private int price;


    public Car(int id, String manufacturer, String model, int vintage, String color, int price) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.vintage = vintage;
        this.color = color;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getVintage() {
        return vintage;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public toString() {
        return "Car{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", vintage=" + vintage +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }


}
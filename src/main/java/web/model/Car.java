package web.model;

public class Car {
    private String carModel;
    private int carSeries;
    private int carNumber;

    public Car(String carModel, int carSeries, int carNumber){
        this.carModel = carModel;
        this.carSeries = carSeries;
        this.carNumber = carNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(int carSeries) {
        this.carSeries = carSeries;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
}

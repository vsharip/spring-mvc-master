package application.model;

public class Car {
    private String model;
    private int yearProduction;
    private int series;


    public Car() {}

    public Car(String model, int yearProduction, int series) {
        this.model = model;
        this.yearProduction = yearProduction;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearProduction=" + yearProduction +
                ", series=" + series +
                '}';
    }
}

package model;

public enum Vehicles {
    TOYOTA("Блакитний", 12000), PEGO("Зелений", 9000), ZAZ("Червоний", 5000),
    LEXUS( "Білий", 19000), MITSUBISHI( "Сріблястий металік", 10000);

    private int priceInUSD;
    private String color;

    Vehicles(String colorValue, int price) {
        priceInUSD = price;
        color = colorValue;
    }

    public String getColor() {
        return this.color;
    }

    public int getPriceInUSD() {
        return this.priceInUSD;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name() + " цвета '" + getColor() + "' и стоимостью " + priceInUSD + " американських доларів";
    }
}

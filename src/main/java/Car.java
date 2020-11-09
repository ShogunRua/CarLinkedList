public class Car {
    // создадим класс Car объекты которого мы будем хранить в нашей системе учета
    private String brand;
    private int number;

    public Car(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;
    }


}

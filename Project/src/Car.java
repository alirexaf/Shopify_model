public class Car {

    private String name;
    private long price;

    public static void main(String[] args) {
        Car car = new Ferrari(5);
        car.name = "458";
        car.price = 100000L;
        System.out.println(car);
    }

    @Override
    public String toString() {
        return "(Car) " + name + " price: " + price;
    }
}

class Ferrari extends Car {
    private int modelNumber;

    public Ferrari(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    @Override
    public String toString() {
        return "(Ferrari) " + super.toString() + String.valueOf(modelNumber);
    }

}
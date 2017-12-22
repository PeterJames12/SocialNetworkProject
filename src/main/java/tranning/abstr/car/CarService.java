package tranning.abstr.car;

public class CarService {

    public static void main(String[] args) {

        Car car = select(CarType.MAZDA);
        car.drive();


    }

    private static Car select(CarType carType) {

        switch (carType) {
            case HONDA:
                return new Honda();
            case MAZDA:
                return new Mazda();
            default:
                return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("car1",4);
        Transport car2 = new Car("car2",4);

        Transport truck = new Truck("truck1",6);
        Transport truck2 = new Truck("truck2",8);

        Transport bicycle = new Bicycle("bicycle1",2);
        Transport bicycle2 = new Bicycle("bicycle2",2);

        ServiceStation station = new ServiceStation();
        station.check1(car);
        station.check1(car2);
        station.check1(bicycle);
        station.check1(bicycle2);
        station.check1(truck);
        station.check1(truck2);
    }
}

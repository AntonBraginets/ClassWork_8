package Example2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPrice(25000);
        System.out.println("Price of the Car is: " + car.getPrice() + " USD");
        car.setSpeed(180);
        System.out.println("Speed of the Car is: " + car.getSpeed() + " km/h");
        car.setYear(2015);
        System.out.println("The Car was built in year: " + car.getYear());
        Plane plane = new Plane();
        plane.setPrice(3);
        System.out.println("Price of the Plane is: " + plane.getPrice() + " mln USD");
        plane.setSpeed(485);
        System.out.println("Speed of the Plane is: " + plane.getSpeed() + " km/h");
        plane.setYear(2016);
        System.out.println("The Plane was built in year: " + plane.getYear());
        plane.setAltitude(12500);
        System.out.println("The Plane can fly at an altitude of: " + plane.getAltitude() + " m");
        plane.setNumberOfPassengers(85);
        System.out.println("The Plane can carry " + plane.getNumberOfPassengers() + " passengers");
        Ship ship = new Ship();
        ship.setPrice(30);
        System.out.println("Price of the Ship is: " + ship.getPrice() + " mln USD");
        ship.setSpeed(48);
        System.out.println("Speed of the Ship is: " + ship.getSpeed() + " km/h");
        ship.setYear(1999);
        System.out.println("The Ship was built in year: " + ship.getYear());
        ship.setPassengers(349);
        System.out.println("The Ship can carry " + ship.getPassengers() + " passengers");
        ship.setPort("Yuzhny");
        System.out.println("Port of registry of this ship is " + ship.getPort());
    }
}
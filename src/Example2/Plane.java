package Example2;

class Plane extends Vehicle {
    @Override
    public void setPrice(double price) {
        super.setPrice(120000000);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setSpeed(double speed) {
        super.setSpeed(350);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setYear(int year) {
        super.setYear(2015);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    private double altitude = 12500;
    private int numberOfPassengers = 85;

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

}

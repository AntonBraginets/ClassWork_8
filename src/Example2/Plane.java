package Example2;

class Plane extends Vehicle {
    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setSpeed(double speed) {
        super.setSpeed(speed);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    private double altitude = 0;
    private int numberOfPassengers = 0;

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

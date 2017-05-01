package Example2;

class Ship extends Vehicle {
    private int passengers = 0;
    private String port;

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

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
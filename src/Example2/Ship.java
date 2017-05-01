package Example2;

class Ship extends Vehicle {
    @Override
    public void setPrice(double price) {
        super.setPrice(30000000);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setSpeed(double speed) {
        super.setSpeed(54);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setYear(int year) {
        super.setYear(1999);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    private int passengers = 150;
    private String port = "Odessa";
}
package Example2;

class Car extends Vehicle {
    @Override
    public void setPrice(double price) {
        super.setPrice(25000);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setSpeed(double speed) {
        super.setSpeed(250);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setYear(int year) {
        super.setYear(2016);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }
}
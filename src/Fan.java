public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }
    public Fan(int speed,double radius,String color, boolean on){
        this.speed=speed;
        this.radius=radius;
        this.color = color;
        this.on = on;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return speed + " " + color + " " + radius + " is on ";
        } else {
            return speed + " " + color + " " + radius + " is off ";
        }
    }
}

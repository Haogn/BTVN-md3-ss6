package baitap.bt4;

public class Fan {
    private final int SLOW = 1 ;
    private  final  int MEDIUM = 2 ;
    private  final int FAST = 3 ;
    private  int speed = SLOW ;
    private boolean on= false;
    private double radius = 5;
    private String color = "blue" ;
    public Fan() {

    }

    public Fan( boolean on,int speed, double radius, String color) {
        this.speed = speed; // toc do quat , mac dinh la 1
        this.on = on ; // xac dinh qua dang bat hay tat , mac dinh la tat = false
        this.radius = radius; // ban kinh qua quat , mac dinh = 5
        this.color = color; // mau sac cua quat , mac dinh = blue
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {

        if ( this.speed == 2 ) {
            this.speed = MEDIUM;
        } else if (this.speed == 3) {
            this.speed = FAST;
        } else if (this.speed == 1) {
            this.speed = SLOW ;
        }
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

    public void statusFan() {
        if (on) {
            System.out.println("Quat dang bat - " + speed  + " - quat mau - " + color + " - ban kinh quat - " + radius);
        } else {
            System.out.println("Quat dang tat - " + " quat mau - " + color + " - ban kinh quat - " + radius);
        }
    }
}

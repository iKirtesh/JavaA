public interface Vehicle {

    void changeGear(int x);

    void speedUp(int x);

    void applyBrakes(int x);
}


    public class Bicycle implements Vehicle {
    int speed;
    int gear;
    public void changeGear(int Gear) {
        gear = Gear;
    }
    public void speedUp(int increment){
        speed = speed + increment;
    }
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public void statusDisplay(){
        System.out.println("Gear:" + gear+" Speed :" +speed );
    }
}



public class Bike implements Vehicle {
    int speed;
    int gear;

    public void changeGear(int Gear) {
        gear = Gear;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void statusDisplay() {
        System.out.println("Gear:" + gear + " Speed :" + speed);
    }
}

public class Car implements Vehicle {
    int speed;
    int gear;

    public void changeGear(int Gear) {
        gear = Gear;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void statusDisplay() {
        System.out.println("Gear:" + gear + " Speed :" + speed);
    }
}



public class InterFaceDemo {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.changeGear(3);
        b.speedUp(2);
        b.applyBrakes(1);
        System.out.println("Bicycle state :");
        b.statusDisplay();

        Bike bk = new Bike();
        bk.changeGear(4);
        bk.speedUp(3);
        bk.applyBrakes(2);
        System.out.println("Bike state :");
        bk.statusDisplay();

        Car c = new Car();
        c.changeGear(5);
        c.speedUp(3);
        c.applyBrakes(1);
        System.out.println("Car state :");
        c.statusDisplay();
    }
}


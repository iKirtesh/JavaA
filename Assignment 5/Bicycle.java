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

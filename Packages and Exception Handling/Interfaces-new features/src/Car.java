public class Car implements Vehicle, Fourwheeler {

    @Override
    public void message() {
        Vehicle.super.message();
    }
}
package Strategy;

//策略2
public class TravelByCarStrategy implements TravelStrategy{
    @Override
    public void travelMode() {
        System.out.println("Travel by car");
    }
}

package Strategy;

//策略1
public class TravelByAirStrategy implements TravelStrategy{
    @Override
    public void travelMode() {
        System.out.println("Travel by air");
    }
}

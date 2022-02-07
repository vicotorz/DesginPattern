package Strategy;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        //飞机
        TravelStrategy travelStrategy = new TravelByAirStrategy();
        context.setTravelStrategy(travelStrategy);
        context.travelMode();

        //开车
        TravelStrategy travelStrategy1 = new TravelByCarStrategy();
        context.setTravelStrategy(travelStrategy1);
        context.travelMode();
    }
}

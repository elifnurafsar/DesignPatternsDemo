public class MoscowHolidayFactory implements HolidayFactory {
    private final Restaurants restaurants;
    private final Activities activities;
    private final Hotels hotel;

    public MoscowHolidayFactory(int day) {
        restaurants = new Restaurants("moscow", day);
        activities = new Activities("moscow");
        hotel = new Hotels("moscow");
    }

    @Override
    public String Hotels() {
        return hotel + "";
    }


    @Override
    public String Restaurants() {
        return restaurants + "\n";
    }

    @Override
    public String Activities() {
        return activities + "\n";
    }


    @Override
    public String toString() {
        return "Hotel: \n" + Hotels() + "\n" + "Restaurants: \n" + Restaurants() + "Activities:" + Activities();
    }
}

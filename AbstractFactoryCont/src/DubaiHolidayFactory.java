public class DubaiHolidayFactory implements HolidayFactory {
    private final Restaurants restaurants;
    private final Activities activities;
    private final Hotels hotel;

    public DubaiHolidayFactory(int day) {
        restaurants = new Restaurants("dubai", day);
        activities = new Activities("dubai");
        hotel = new Hotels("dubai");
    }

    @Override
    public String Hotels() {
        return hotel+"";
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

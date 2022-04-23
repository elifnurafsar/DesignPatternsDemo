import java.util.Random;

public class Restaurants {
    private String[] restaurants_stored;
    private String[] restaurants_selected;

    Random rand = new Random();

    public Restaurants(){

    }

    public Restaurants(String s, int day){
        if(s.equalsIgnoreCase("dubai")){
            StoreRestaurantsDubai();
        }
        else if(s.equalsIgnoreCase("moscow")){
            StoreRestaurantsMoscow();
        }
        restaurants_selected = new String[day];
        for (int i=0; i<day; i++){
            int rand_int = rand.nextInt(4);
            restaurants_selected[i] = restaurants_stored[rand_int];
        }
    }

    public String[] getRestaurants_selected() {
        return restaurants_selected;
    }

    private void StoreRestaurantsDubai(){
        restaurants_stored = new String[5];
        restaurants_stored[0]="CeLaVie";
        restaurants_stored[1]="Amazon";
        restaurants_stored[4]="The Grey DXB";
        restaurants_stored[3]="Doors";
        restaurants_stored[2]="Taverna";
    }

    public void StoreRestaurantsMoscow(){
        restaurants_stored = new String[5];
        restaurants_stored[0]="Turnadot";
        restaurants_stored[1]="Cafe Pushkin";
        restaurants_stored[4]="Kazbek";
        restaurants_stored[3]="Ruski";
        restaurants_stored[2]="Sixty";
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (String restaurant : restaurants_selected) {
            str.append("->").append(restaurant).append("\n");
        }
        return str + "\n";
    }
}

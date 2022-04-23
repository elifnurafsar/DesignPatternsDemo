import java.util.Random;

public class Hotels {
    private String[] hotels_stored;
    private String hotel_selected;

    Random rand = new Random();

    public Hotels(){

    }

    public Hotels(String s){
        if(s.equalsIgnoreCase("dubai")){
            StoreHotelsDubai();
        }
        else if(s.equalsIgnoreCase("moscow")){
            StoreHotelsMoscow();
        }
        int hotel_rand =  rand.nextInt(2);
        hotel_selected = hotels_stored[hotel_rand];
    }

    private void StoreHotelsDubai(){
        hotels_stored = new String[3];
        hotels_stored[0]="Address Beach";
        hotels_stored[1]="Raffles";
        hotels_stored[2]="Burj Al Arab";
    }


    public void StoreHotelsMoscow(){
        hotels_stored = new String[3];
        hotels_stored[0]="Radisson Collection";
        hotels_stored[1]="Four Seasons";
        hotels_stored[2]="Hilton";
    }

    @Override
    public String toString() {
        return hotel_selected;
    }
}

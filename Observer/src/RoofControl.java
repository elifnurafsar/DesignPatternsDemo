public class RoofControl implements Observer{

    String s = "\nRoof is closing.\n";
    boolean opened = false;
    public RoofControl(){

    }

    @Override
    public void update(Observable observableObj) {
        RainSensor rs= (RainSensor) observableObj;
        System.out.println("Rain sensor returned: " + rs.getCurrValue() + s);
        opened=true;
    }
}

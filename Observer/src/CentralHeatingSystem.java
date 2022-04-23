public class CentralHeatingSystem implements Observer{

    String s = "\nHeating system activated.\n";
    boolean is_active=false;

    public CentralHeatingSystem(){

    }

    @Override
    public void update(Observable observableObj) {
        RainSensor rs= (RainSensor) observableObj;
        System.out.println("Rain sensor returned: " + rs.getCurrValue() + s);
        is_active=true;
    }
}

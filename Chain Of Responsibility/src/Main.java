public class Main {
    public static void main(String[] args) {
        AlertSender alertSender = AlertUnit.getUnit();
        alertSender.Alert("GPS");
        /*alertSender.Alert("Temperature Sensor");
        alertSender.Alert("Wind Speed Sensor");
        alertSender.Alert("Wind Direction Sensor");
        alertSender.Alert("Rainfall Sensor");
        alertSender.Alert("Pressure Sensor");
        alertSender.Alert("GPS");*/
    }
}

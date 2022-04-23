public class AlertUnit {
    public static AlertSender getUnit(){

        TemperatureSensor ts= new TemperatureSensor();
        WindDirectionSensor wds= new WindDirectionSensor();
        WindSpeedSensor wss= new WindSpeedSensor();
        RainfallSensor rs=new RainfallSensor();
        HumiditySensor hs= new HumiditySensor();
        PressureSensor ps= new PressureSensor();
        GPS gps = new GPS();

        AlertSender sender = ts.setNext(wds.setNext(wss.setNext(rs.setNext(hs.setNext(ps.setNext(gps))))));
        return sender;
    }
}

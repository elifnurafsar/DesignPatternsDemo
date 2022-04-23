public class Main {
    public static void main(String[] args) {
        RainSensor r = new RainSensor();
        RoofControl roof = new RoofControl();
        CentralHeatingSystem chs = new CentralHeatingSystem();
        r.addObserver(roof);
        r.addObserver(chs);
        r.setOptimalValue(50);
        for(int i=47; i< 54; i++){
            System.out.println("Sensör'ün anlık değeri: "+i);
            r.setCurrValue(i);
        }
    }
}

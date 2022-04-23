import java.util.Random;
public class WeatherForecast{
    private Forecaster forecastClass;
    int num_of_inputs;
    int power;
    Random rand = new Random();

    public WeatherForecast(){
       getDataAndDecide();
       //getForecast();
    }

    public void getDataAndDecide(){
        power = rand.nextInt(10);
        num_of_inputs = rand.nextInt(6) + 1;
        if(power < 3){
            forecastClass = new KalmanBucyFilter();
        }
        else if(num_of_inputs==6){
            forecastClass = new Kringing();
        }
        else if(num_of_inputs==5){
            forecastClass = new SmoothingSplines();
        }
        else if(num_of_inputs==4){
            forecastClass = new OptimalInterpolation();
        }
        else if(num_of_inputs==3){
            forecastClass = new ConstrainedInitialization();
        }
        else if(num_of_inputs==2){
            forecastClass = new AdjointModelDataAssimilation();
        }
        else if(num_of_inputs == 1){
            forecastClass = new SuccessiveCorrections();
        }
    }

    public String getForecast(){

        System.out.println("    Forecast Menu ");

        String forecast_results = "Number Of Inputs: " + num_of_inputs + "\nPower: " + power + "\nAlgorithm: " + forecastClass.Forecast() + " \n";

        return forecast_results;
    }
}

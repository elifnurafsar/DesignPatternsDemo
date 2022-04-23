//rain sensor degerleri takip edilecek
public class RainSensor extends Observable{
    //if the value is greater than optimal value it is too rainy
    private int optimal_value = 0;
    //current value
    private int curr_value;

    public RainSensor(){
        this.curr_value=0;
    }

    public void setCurrValue(int curr_value) {
        this.curr_value = curr_value;
        if(this.optimal_value < this.curr_value) {
            Alert();
        }
    }

    public void setOptimalValue(int optimal_value) {
        this.optimal_value = optimal_value;
    }

    public int getCurrValue() {
        return curr_value;
    }

    public int getOptimalValue() {
        return optimal_value;
    }
}

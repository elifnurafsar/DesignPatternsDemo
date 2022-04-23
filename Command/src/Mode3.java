public class Mode3 implements Mode {
    private boolean isSelected=false;
    String[] screen_components;

    public Mode3(){
        screen_components = new String[3];
        screen_components[0]="Capitals Graph";
        screen_components[1]="Local Map";
        screen_components[2]="In Day Expectations List";
    }
    public String Screen() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < screen_components.length; i++) {
            str.append(screen_components[i]).append("\n");
        }
        return str.toString();
    }

    /*public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isSelected() {
        return isSelected;
    }*/

}
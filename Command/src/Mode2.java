public class Mode2 implements Mode{
    private boolean isSelected=false;
    String[] screen_components;

    public Mode2(){
        screen_components = new String[3];
        screen_components[0]="Local Map";
        screen_components[1]="Local Weather Graph";
        screen_components[2]="Timeline Graph";
    }
    public String Screen(){
        StringBuilder str= new StringBuilder();
        for(int i=0; i<screen_components.length;i++){
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

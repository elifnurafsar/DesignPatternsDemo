public class ModeItem {
    private Mode m;
    public ModeItem(Mode mode){
        this.m=mode;
    }
    public void Click(){
        System.out.println(m.Screen());
    }
}

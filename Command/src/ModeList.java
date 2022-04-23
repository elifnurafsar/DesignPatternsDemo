import java.util.ArrayList;
//MacroCommand
public class ModeList {
    private ArrayList<Mode> mode_list;

    public ModeList(){
        mode_list = new ArrayList<>();
    }

    public void addMode(Mode m){
        mode_list.add(m);
    }

    public void RemoveMode(Mode m){ mode_list.remove(m); }

    public void selected(int i, boolean b){
        //mode_list.get(i).setSelected(b);
        System.out.println(mode_list.get(i).Screen());
    }
}

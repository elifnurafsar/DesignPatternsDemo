import java.util.Arrays;

public class Activities {
    private String[][] activities_stored;

    public Activities(){

    }

    public Activities(String s){
        if(s.equalsIgnoreCase("dubai")){
            StoreActivitiesDubai();
        }
        else if(s.equalsIgnoreCase("moscow")){
            StoreActivitiesMoscow();
        }
    }

    private void StoreActivitiesDubai(){
        activities_stored = new String[5][4];
        activities_stored[0][0]="Shopping Malls:";
        activities_stored[0][1]="The Dubai Mall";
        activities_stored[0][2]="Mall Of Emirates";
        activities_stored[0][3]="Marina Mall";

        activities_stored[1][0]="Beaches:";
        activities_stored[1][1]="JBR";
        activities_stored[1][2]="Kite";
        activities_stored[1][3]="Niki";

        activities_stored[2][0]="Desert Surf:";
        activities_stored[2][1]="SUV";
        activities_stored[2][2]="JEEP";
        activities_stored[2][3]="ATV";

        activities_stored[3][0]="Yatch Tours:";
        activities_stored[3][1]="JBR";
        activities_stored[3][2]="Palm";
        activities_stored[3][3]="";

        activities_stored[4][0]="Old Town Tour";
        activities_stored[4][1]="";
        activities_stored[4][2]="";
        activities_stored[4][3]="";
    }

    public void StoreActivitiesMoscow(){
        activities_stored = new String[4][4];
        activities_stored[0][0]="Churchs:";
        activities_stored[0][1]="Chris Saviour Cathedral";
        activities_stored[0][2]="Kazan Kathedral";
        activities_stored[0][3]="St Basil's Cathedral";

        activities_stored[1][0]="Skiing:";
        activities_stored[1][1]="AllPro";
        activities_stored[1][2]="Snezh";
        activities_stored[1][3]="Gornolyzhnyy";

        activities_stored[2][0]="Parks:";
        activities_stored[2][1]="Park Gorky";
        activities_stored[2][2]="Yekaterinsky";
        activities_stored[2][3]="";

        activities_stored[3][0]="Museums:";
        activities_stored[3][1]="Pushkin";
        activities_stored[3][2]="Gulag";
        activities_stored[3][3]="";
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i=0; i< activities_stored.length; i++){
            for(int j=0; j<activities_stored[i].length; j++){
                if(j==0){
                    str.append("\n").append(activities_stored[i][j]).append(" ");
                }
                else if(!activities_stored[i][j].equals(""))
                {
                    if(j<activities_stored[i].length-1)
                        str.append(activities_stored[i][j]).append(", ");
                    else
                        str.append(activities_stored[i][j]);
                }
            }

        }
        return str + "\n";
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("In current weather conditions most preferable cities to visit are");
        System.out.println("Dubai");
        System.out.println("Moscow");
        System.out.println("Please enter which one do you prefer?");
        String s = in.nextLine();
        System.out.println("Please enter how much days you want to stay in there?");
        int day = in.nextInt();
        HolidayFactory myFactory = null;
        if(s.toLowerCase().equals("dubai")){
            myFactory = new DubaiHolidayFactory(day);
            System.out.println("Hotel: ");
            System.out.println(myFactory.Hotels() + "\n");
            System.out.println("Restaurants: ");
            System.out.print(myFactory.Restaurants());
            System.out.print("Activities: ");
            System.out.print(myFactory.Activities());
        }
        else if(s.toLowerCase().equals("moscow")){
            myFactory = new MoscowHolidayFactory(day);
            System.out.println("Hotel: ");
            System.out.println(myFactory.Hotels() + "\n");
            System.out.println("Restaurants: ");
            System.out.print(myFactory.Restaurants());
            System.out.print("Activities: ");
            System.out.print(myFactory.Activities());
        }
        //System.out.println(myFactory);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mode m1=new Mode1();
        Mode m2=new Mode2();
        Mode m3=new Mode3();
        ModeList m_list=new ModeList();
        m_list.addMode(m1);
        m_list.addMode(m2);
        m_list.addMode(m3);
        Scanner in = new Scanner(System.in);
        System.out.println("Select mode 1,2 or 3 to display content");
        int choice = in.nextInt();
        m_list.selected(--choice, true);
    }
}

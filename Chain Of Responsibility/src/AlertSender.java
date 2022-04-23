public class AlertSender {
    private String name="";
    private AlertSender next;

    public AlertSender(String s){
        name=s;
    }

    public AlertSender getNext(){
        return next;
    }

    public AlertSender setNext(AlertSender next) {
        this.next = next;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Alert(String cmd){
        System.out.println(cmd+ " came to "+name+" handler.");
        System.out.println("-------------------------");
        if(cmd.equals(this.name)){
            System.out.println("Warning! Please check " + name + "sensor. ");
        }
        else if(next !=null){
            next.Alert(cmd);
        }
        else{
            System.out.println("Cannot find related unit.");
        }
    }

}

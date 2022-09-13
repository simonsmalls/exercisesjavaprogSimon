public class WorkStation extends Node{

    // the constructors (do not touch!):
    public WorkStation() {
        super();
    }
    public WorkStation(String anAddress) {
        super(anAddress);
    }

    public void originate(Packet p) {
        // fake print operation: output to console
        System.out.println("send from workstation");
        p.setWorkstationAddress(this.address);
        this.send(p);

    }

    public void receive(Packet p) {

        if (this.address.equals(p.workstationaddress) || p.destinationAddress.equals(address) ){
            if (this.address.equals(p.workstationaddress)) {
                System.out.println("already sent take it out by workstation ");
            }else {
                System.out.println(p.contents);
            }
        }else {
            this.send(p);
        }
        //this is default behaviour for all kinds of nodes;
        //subclasses will probably override this method to do something special
    }
}

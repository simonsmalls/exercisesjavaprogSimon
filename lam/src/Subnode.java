public class Subnode extends Node {


    public void print(Packet p) {
        // fake print operation: output to console
        System.out.println(p.contents + " by " + p.destinationAddress);
    }
    public void receive(Packet p) {


        if (p.destinationAddress.equals(address)){
            this.print(p);
            Packet p2 = new Packet("packet delivered, all good", p.workstationaddress);
            this.send(p2);


        }else{

            this.send(p);


        }
    }
}

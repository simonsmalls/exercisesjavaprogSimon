public class TapeStreamer extends Subnode{

    public TapeStreamer(String anAddress) {
        address = anAddress;
    }



    public void print(Packet p) {
        // fake print operation: output to console
        System.out.println(p.contents + " by " + p.destinationAddress +" this is saved and taped as well");
    }
}

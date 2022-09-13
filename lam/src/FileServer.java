public class FileServer extends Subnode{

    public FileServer(String anAddress) {
        address = anAddress;
    }

    public void print(Packet p) {
        // fake print operation: output to console
        System.out.println(p.contents + " by " + p.destinationAddress+ " dit is gesaved");
    }


}

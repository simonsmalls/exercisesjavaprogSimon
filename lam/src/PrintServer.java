public class PrintServer extends Subnode {

// the attributes:

	
// the constructors (do not touch!):
	public PrintServer() {
		super();
	}
	public PrintServer (String anAddress) {
		address = anAddress;
	}

// the get & set methods:

// the other methods:

	public void print(Packet p) {
		// fake print operation: output to console
		System.out.println(p.contents + " by " + p.destinationAddress);
	}





}
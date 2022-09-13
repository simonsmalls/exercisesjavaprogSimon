public class Node {
	
// the attributes:
	String address;
	Node nextNode;
	Node previousNode;

// the constructors (do not touch!):
	public Node ( ) {
	}
	public Node (String anAddress) {
	address = anAddress;
	}

// the get & set methods:
	public String getAddress() {
		return address;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public Node getPreviousNode() {
		return previousNode;
	}
	public void setAddress(String anAddress) {
		address = anAddress;
	}
	public void setNextNode(Node aNode) {
		nextNode = aNode;
	}
	public void setPreviousNode(Node aNode) {
		previousNode = aNode;
	}


// the other methods:
	public void receive(Packet p) {

		this.send(p);

	//this is default behaviour for all kinds of nodes;
	//subclasses will probably override this method to do something special
	}

	public void send(Packet p) {



		if (nextNode == null){
			System.out.println("no connection here"+ this.address);
		}else{
			System.out.println(address+ "is sending the packet to node address "  + nextNode.address);
			nextNode.receive(p);
		}




	//this is default behaviour for all kinds of nodes.
	}

	
	

}

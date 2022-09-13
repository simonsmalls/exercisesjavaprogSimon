public class Bridge extends Node {

    Bridge nextBridge;

    public Bridge (String anAddress) {
        address = anAddress;
    }

    public Bridge getNextBridge() {
        return nextBridge;
    }
    public void setNextBridge(Bridge aBridge) {
        nextBridge = aBridge;
    }

    public void receive(Packet p) {

        System.out.println("bridge used");
        nextBridge.send(p);

        //this is default behaviour for all kinds of nodes;
        //subclasses will probably override this method to do something special
    }
}

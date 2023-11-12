package children;

public class NodeChild {
    private int amountCandyChild;
    private NodeChild next;

    public NodeChild(){
        setAmountCandyChild(0);
    }

    public int getAmountCandyChild(){
        return this.amountCandyChild;
    }

    public NodeChild getNext(){
        return this.next;
    }
    public void setNext(NodeChild next) {
        this.next = next;
    }

    private void setAmountCandyChild(int amountCandyChild) {
        this.amountCandyChild = amountCandyChild;
    }
}
